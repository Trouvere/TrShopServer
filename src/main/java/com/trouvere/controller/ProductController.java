package com.trouvere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.trouvere.entity.Product;
import com.trouvere.service.ProductService;

@RestController

@RequestMapping(value = "/product")

public class ProductController {
	@Autowired
	private ProductService service;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Product> getAllProduct() {
		return service.getAllProduct();
	}

	@RequestMapping(value = "/{productID}", method = RequestMethod.GET)
	@ResponseBody
	public Product getProduct(@PathVariable("productID") long productID) {
		return service.getByIDProduct(productID);
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public Product saveProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}

	@RequestMapping(value = "/{productID}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProduct(@PathVariable long productID) {
		service.removeProduct(productID);
	}

}
