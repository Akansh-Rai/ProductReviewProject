/**
 * 
 */
package com.epam.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Akansh_Rai
 *
 */
@FeignClient(value = "jplaceholder", url = "http://localhost:8081/JavaOnboardingProject")
public interface JSONPlaceHolderClient {

}
