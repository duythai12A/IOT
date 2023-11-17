package com.example.webbanquanao.controller;

import com.example.webbanquanao.service.SensorService;
import com.example.webbanquanao.utils.ResponseBase;
import com.example.webbanquanao.utils.ResponseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/sensor")
@RestController
public class SensorController {

    @Autowired
    private SensorService sensorService;

    @GetMapping("/sum")
    public ResponseEntity<ResponseBase> sumTime(){
        ResponseBase responseBase;
        HttpStatus httpStatus;
        httpStatus = HttpStatus.OK;
        responseBase = new ResponseBase(new Object[]{sensorService.sumTime()}, ResponseType.SUCCESS, "");
        return new ResponseEntity<>(responseBase, httpStatus);
    }

    @GetMapping("/list")
    public ResponseEntity<ResponseBase> search(){
        ResponseBase responseBase;
        HttpStatus httpStatus;
        httpStatus = HttpStatus.OK;
        responseBase = new ResponseBase(new Object[]{sensorService.search()}, ResponseType.SUCCESS, "");
        return new ResponseEntity<>(responseBase, httpStatus);
    }
}
