package com.example.webbanquanao.service.dto;

import jakarta.persistence.Column;

import java.util.Date;

public class SensorDto {
    private Long id;
    private Date start;
    private Date end;
    private Date dateStorage;
    private Long timeLight;

    public SensorDto() {
    }

    public SensorDto(Long id, Date start, Date end, Date dateStorage, Long timeLight) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.dateStorage = dateStorage;
        this.timeLight = timeLight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Date getDateStorage() {
        return dateStorage;
    }

    public void setDateStorage(Date dateStorage) {
        this.dateStorage = dateStorage;
    }

    public Long getTimeLight() {
        return timeLight;
    }

    public void setTimeLight(Long timeLight) {
        this.timeLight = timeLight;
    }
}
