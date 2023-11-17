package com.example.webbanquanao.service.impl;

import com.example.webbanquanao.entity.Sensor;
import com.example.webbanquanao.service.SensorService;
import com.example.webbanquanao.service.dto.SensorDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class SensorServiceImpl implements SensorService {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Autowired
    private ObjectMapper objectMapper;
    @Override
    public long sumTime() {
        return sum();
    }

    @Override
    public List<SensorDto> search() {
        StringBuilder sql = new StringBuilder(" select * from dbb.sensor s ");
        Map<String, Objects> parameter = new HashMap<>();
        List<Sensor> sensorList = namedParameterJdbcTemplate.query(sql.toString(), parameter, new BeanPropertyRowMapper<>(Sensor.class));
        List<SensorDto> sensorDtoList = new ArrayList<>();
        sensorList.forEach(sensor -> {
              SensorDto sensorDto = objectMapper.convertValue(sensor, SensorDto.class);
              sensorDto.setTimeLight(sensor.getEnd().getTime() - sensor.getStart().getTime());
              sensorDtoList.add(sensorDto);
        });
        return sensorDtoList;
    }

    private Long sum(){
        StringBuilder sql = new StringBuilder(" select sum(s.end - s.start) from dbb.sensor s ");
        Map<String, Objects> parameter = new HashMap<>();
        return namedParameterJdbcTemplate.queryForObject(sql.toString(), parameter, Long.class);
    }
}
