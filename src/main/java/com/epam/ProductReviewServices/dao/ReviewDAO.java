/**
 * 
 */
package com.epam.ProductReviewServices.dao;

import org.springframework.data.repository.CrudRepository;

import com.epam.ProductReviewServices.domain.ProductReview;

/**
 * @author Akansh_Rai
 *
 */
public interface ReviewDAO extends CrudRepository<ProductReview, Integer> {

}
