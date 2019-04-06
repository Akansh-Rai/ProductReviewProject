/**
 * 
 */
package com.epam.ProductReviewServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epam.ProductReviewServices.domain.Review;
import com.epam.ProductReviewServices.service.ProductReviewService;

import io.swagger.annotations.ApiOperation;

/**
 * @author Akansh_Rai
 *
 */
@RestController
@RequestMapping("/reviews")
public class ProductReviewController {

	@Autowired
	ProductReviewService reviewService;

	@ApiOperation(value = "Get the list of all Product reviews from Server.", notes = "Return list of Reviews", response = Review.class, responseContainer = "List")
	@GetMapping
	public Iterable<Review> getAllReviews() {
		return reviewService.getReviews();
	}

	@ApiOperation(value = "Get list of reviews for given product Id.", notes = "Return List the list of  review for a given product id.", response = Review.class, responseContainer = "List")
	@GetMapping("/{id}")
	public List<Review> getReview(@PathVariable int id) {
		return reviewService.getProductReview(id);
	}

	@ApiOperation(value = "Add the Review for a given product.", response = Review.class)
	@PostMapping("/{id}")
	public Review addReview(@PathVariable int id, @RequestBody Review productReview) {
		productReview.setProductId(id);
		return reviewService.addProduct(productReview);
	}

}
