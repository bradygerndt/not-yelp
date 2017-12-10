package com.service;

import com.dao.ReviewDAO;
import com.domain.Review;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ReviewService {

    public List<Review> getReviewsByRestID(BigDecimal id){
        List<Review> revList = new ArrayList<Review>();
        ReviewDAO revDao = new ReviewDAO();
        revList = revDao.getRestReviews(id);
        return revList;
    }

    public Boolean submitReview(Review review) {
        ReviewDAO revDao = new ReviewDAO();

        Boolean result = revDao.submitReview(review);

        return result;
    }
}
