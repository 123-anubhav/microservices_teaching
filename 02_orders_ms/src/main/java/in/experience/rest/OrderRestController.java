package in.experience.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import in.experience.dto.ProductDTO;
import in.experience.feign.IFeignClient;

@org.springframework.web.bind.annotation.RestController
public class OrderRestController {

	@Autowired
	private IFeignClient outerCall;

	@GetMapping("/orders")
	public List<ProductDTO> ordersList() {
		System.out.println("RestController.ordersList()");
		List<ProductDTO> products = outerCall.getProducts();
		
		/*
		 * if(products==null) { return
		 * "products service is down.... pls try after some time"; }
		 */
		
		products.forEach(p->System.out.println(p));
		
		System.out.println("IFeignClient response :: products => " + products);
		return  products;
	}
}
