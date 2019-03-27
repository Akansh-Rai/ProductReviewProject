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

import com.epam.ProductReviewServices.domain.ProductReview;
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

	@ApiOperation(value = "Get the list of all Product reviews from Server.", notes = "Return list of Reviews", response = ProductReview.class, responseContainer = "List")
	@GetMapping
	public Iterable<ProductReview> getAllReviews() {
		return reviewService.getReviews();
	}

	@ApiOperation(value = "Get list of reviews for given product Id.", notes = "Return List the list of  review for a given product id.", response = ProductReview.class, responseContainer = "List")
	@GetMapping("/{id}")
	public List<ProductReview> getReview(@PathVariable int id) {
		return reviewService.getProductReview(id);
	}

	@ApiOperation(value = "Add the Review for a given product.", response = ProductReview.class)
	@PostMapping("/{id}")
	public ProductReview addReview(@PathVariable int id, @RequestBody ProductReview productReview) {
		productReview.setProductId(id);
		return reviewService.addProduct(productReview);
	}

}
