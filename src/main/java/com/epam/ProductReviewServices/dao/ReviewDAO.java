/**
 * 
 */
package com.epam.ProductReviewServices.dao;

import org.springframework.data.repository.CrudRepository;

import com.epam.ProductReviewServices.domain.Review;

/**
 * @author Akansh_Rai
 *
 */
public interface ReviewDAO extends CrudRepository<Review, Integer> {

}
