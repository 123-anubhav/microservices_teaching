package in.experience.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import in.experience.dto.ProductDTO;

@FeignClient(name = "01-PRODUCTS-MS")
public interface IFeignClient {

	@GetMapping("/products")
	public List<ProductDTO> getProducts();

}
