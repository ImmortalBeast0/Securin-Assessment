package com.kce.weather.service;

import java.util.List;

import com.kce.weather.entity.WeatherReport;

public interface WeatherReportService {

    WeatherReport getByDate(String date);

    List<WeatherReport> getByMonth(int month);

    List<WeatherReport> getTemperatureStats(int year);
}