package com.example.webbanquanao.service;

import com.example.webbanquanao.service.dto.SensorDto;

import java.util.List;

public interface SensorService {
    long sumTime();

    List<SensorDto> search ();
}
