package com.example.smartcity.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.smartcity.backend.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}