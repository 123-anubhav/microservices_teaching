package in.experience.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import in.experience.dto.ProductDTO;

@org.springframework.web.bind.annotation.RestController
public class ProductRestController {

	@GetMapping("/products")	
	 public List<ProductDTO> getAllProducts() {
	        // Here you would typically retrieve the products from a database
	        // For this example, we'll create a static list of products

		System.out.println("============================       ProductRestController.getAllProducts() EXECUTES ============================");
		
	        List<ProductDTO> products = new ArrayList<>();

	        // Adding some sample products
	        products.add(new ProductDTO(1L, "Product 1", "Description of Product 1", 99.99, "Electronics"));
	        products.add(new ProductDTO(2L, "Product 2", "Description of Product 2", 49.99, "Furniture"));
	        products.add(new ProductDTO(3L, "Product 3", "Description of Product 3", 19.99, "Clothing"));

	        return products;
	    }
}
