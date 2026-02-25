package com.kce.weather.repository;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kce.weather.entity.WeatherReport;

@Repository
public interface WeatherReportRepository extends JpaRepository<WeatherReport, Long>{
	Optional<WeatherReport> findByDate(Instant date);

    List<WeatherReport> findByDateBetween(Instant start, Instant end);
}
