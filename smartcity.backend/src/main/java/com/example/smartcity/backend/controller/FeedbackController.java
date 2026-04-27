package com.example.smartcity.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.smartcity.backend.model.Feedback;
import com.example.smartcity.backend.repository.FeedbackRepository;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class FeedbackController {

    @Autowired
    private FeedbackRepository repo;

    @PostMapping("/feedback")
    public Feedback addFeedback(@RequestBody Feedback f) {
        return repo.save(f);
    }

    @GetMapping("/feedback")
    public List<Feedback> getFeedback() {
        return repo.findAll();
    }
}