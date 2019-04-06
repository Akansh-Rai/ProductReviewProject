/**
 * 
 */
package com.epam.ProductReviewServices.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.ProductReviewServices.dao.ReviewDAO;
import com.epam.ProductReviewServices.domain.Review;

/**
 * @author Akansh_Rai
 *
 */
@Service
public class ProductReviewServiceImpl implements ProductReviewService {

	@Autowired
	private ReviewDAO reviewRepository;

	@Override
	public Iterable<Review> getReviews() {
		return reviewRepository.findAll();
	}

	@Override
	public List<Review> getProductReview (int productId) {
		Iterable<Review> iterable = reviewRepository.findAll();
		return StreamSupport.stream(iterable.spliterator(), false)
				.filter(review -> review.getProductId().intValue() == productId).collect(Collectors.toList());
	}

	@Override
	public Review addProduct(Review productReview) {
		int id = reviewRepository.save(productReview).getReviewId();
		productReview.setRating(id);
		return productReview;
	}
}
