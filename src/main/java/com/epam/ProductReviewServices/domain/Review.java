/**
 * 
 */
package com.epam.ProductReviewServices.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Akansh_Rai
 *
 */
@Entity
@Table(name="product_review")
public class Review {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer reviewId;
	
	private Integer productId;
	
	private Integer rating;

	/**
	 * @return the id
	 */
	public Integer getReviewId() {
		return reviewId;
	}

	/**
	 * @param id the id to set
	 */
	public void setReviewId(Integer id) {
		this.reviewId = id;
	}

	/**
	 * @return the productId
	 */
	public Integer getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	/**
	 * @return the rating
	 */
	public Integer getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
}
