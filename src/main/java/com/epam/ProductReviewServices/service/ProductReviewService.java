/**
 * 
 */
package com.epam.ProductReviewServices.service;

import java.util.List;

import com.epam.ProductReviewServices.domain.Review;

/**
 * @author Akansh_Rai
 *
 */
public interface ProductReviewService {

	public Iterable<Review> getReviews();

	public List<Review> getProductReview(int productId);

	public Review addProduct(Review productReview);

	//public void removeProduct(int id);

	//public void removeProduct(Product product);

	//public Product updateProduct(int id, Product product);
}
