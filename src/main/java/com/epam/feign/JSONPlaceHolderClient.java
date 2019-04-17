/**
 * 
 */
package com.epam.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Akansh_Rai
 *
 */
@FeignClient(value = "product-service")
public interface JSONPlaceHolderClient {

}
