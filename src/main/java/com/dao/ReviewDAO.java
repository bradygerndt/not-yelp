package com.dao;

import com.domain.Review;
import com.util.ConnectionFactory;
import org.apache.ibatis.session.SqlSession;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ReviewDAO {

    public List<Review> getRestReviews(BigDecimal restid) {
        SqlSession session = new ConnectionFactory().getSqlSessionFactory().openSession();
        List<Review> revList = new ArrayList<Review>();


        try{
            revList = session.selectList("com.mapper.ReviewMapper.selectReviewByRest", restid);
        }
        finally {
            session.close();
        }
        return revList;
    }
    public Boolean submitReview(Review review) {
        SqlSession session = new ConnectionFactory().getSqlSessionFactory().openSession();
        List<Review> revList = new ArrayList<Review>();
        int success;


        try{
            success = session.insert("com.mapper.ReviewMapper.submitReview", review);
            session.commit();
        }
        finally {
            session.close();
        }
        if(success >=1) {
            return true;
        }
        else{
            return false;
        }
    }
}
