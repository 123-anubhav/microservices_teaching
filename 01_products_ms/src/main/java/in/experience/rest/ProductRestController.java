package in.experience.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.experience.dto.ProductDTO;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/product-api")
public class ProductRestController {

	@Autowired
	private Environment environment;

	@GetMapping("/products")
	public List<ProductDTO> getAllProducts() {
		// Here you would typically retrieve the products from a database
		// For this example, we'll create a static list of products
		 String port = environment.getProperty("server.port");

	        // Print the server.port value to the console
	        System.out.println("============================       Server is running on port: " + port + " ============================");

	        
		System.out.println(
				"============================       ProductRestController.getAllProducts() EXECUTES ============================");

		List<ProductDTO> products = new ArrayList<>();

		// Adding some sample products
		products.add(new ProductDTO(1L, "Product 1", "Description of Product 1", 99.99, "Electronics"));
		products.add(new ProductDTO(2L, "Product 2", "Description of Product 2", 49.99, "Furniture"));
		products.add(new ProductDTO(3L, "Product 3", "Description of Product 3", 19.99, "Clothing"));

		return products;
	}
}
