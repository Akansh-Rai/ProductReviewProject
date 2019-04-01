/**
 * 
 */
package com.epam.ProductReviewServices.service;

import java.util.List;

import com.epam.ProductReviewServices.domain.ProductReview;

/**
 * @author Akansh_Rai
 *
 */
public interface ProductReviewService {

	public Iterable<ProductReview> getReviews();

	public List<ProductReview> getProductReview(int productId);

	public ProductReview addProduct(ProductReview productReview);

	//public void removeProduct(int id);

	//public void removeProduct(Product product);

	//public Product updateProduct(int id, Product product);
}
