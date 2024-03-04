package com.backend.Agriculture.services;


import java.util.List;

import com.backend.Agriculture.entities.Feedback;

public interface FeedbackService {

	void saveFeedback(Feedback feedback);

	List<Feedback> findAllFeedbacks();

}

