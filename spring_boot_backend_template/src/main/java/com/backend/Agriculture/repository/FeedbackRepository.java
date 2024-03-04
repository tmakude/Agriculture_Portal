package com.backend.Agriculture.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.Agriculture.entities.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer>{

}

