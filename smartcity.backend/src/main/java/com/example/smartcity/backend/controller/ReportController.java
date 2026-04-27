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

    //  CREATE
    @PostMapping("/reports")
    public Report addReport(@RequestBody Report r) {
        return repo.save(r);
    }

    //  READ
    @GetMapping("/reports")
    public List<Report> getReports() {
        return repo.findAll();
    }

    //  UPDATE
    @PutMapping("/reports/{id}")
    public Report updateReport(@PathVariable Long id, @RequestBody Report r) {
        Report existing = repo.findById(id).orElse(null);

        if (existing != null) {
            existing.setTitle(r.getTitle());
            existing.setDescription(r.getDescription());
            return repo.save(existing);
        }

        return null;
    }

    //  DELETE
    @DeleteMapping("/reports/{id}")
    public String deleteReport(@PathVariable Long id) {
        repo.deleteById(id);
        return "Deleted Successfully";
    }
}