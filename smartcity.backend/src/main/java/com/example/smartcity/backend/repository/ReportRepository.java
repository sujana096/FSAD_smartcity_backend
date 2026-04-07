package com.example.smartcity.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.smartcity.backend.model.Report;

public interface ReportRepository extends JpaRepository<Report, Long> {
}