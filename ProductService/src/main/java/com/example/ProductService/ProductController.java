package com.example.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping (path="/Customer")
public class ProductController{
 
	@GetMapping(path="/getCustomer")
	public String getCustomer() {
		return "hiii";
	}
}