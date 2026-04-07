package com.example.smartcity.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.smartcity.backend.model.Report;
import com.example.smartcity.backend.repository.ReportRepository;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ReportController {

    @Autowired
    private ReportRepository repo;

    @PostMapping("/reports")
    public Report addReport(@RequestBody Report r) {
        return repo.save(r);
    }

    @GetMapping("/reports")
    public List<Report> getReports() {
        return repo.findAll();
    }
}