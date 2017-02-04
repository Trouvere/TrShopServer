package com.trouvere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.trouvere.entity.Category;
import com.trouvere.entity.Product;
import com.trouvere.service.CategoryService;

//Для добавления продуктов и категорий
@RestController

@RequestMapping(value = "/modification")
// @RequestMapping(value = "/modification", produces =
// MediaType.APPLICATION_JSON_VALUE)
public class ModificationController {
	@Autowired
	private CategoryService service;

	// Category
	@RequestMapping(value = "/category", method = RequestMethod.GET)
	@ResponseBody
	public List<Category> getAllCategory() {
		return service.getAllCategory();
	}

	@RequestMapping(value = "/category/{categoryID}", method = RequestMethod.GET)
	@ResponseBody
	public Category getByIDCategory(@PathVariable("categoryID") long categoryID) {
		return service.getByIDCategory(categoryID);
	}

	@RequestMapping(value = "category", method = RequestMethod.POST)
	@ResponseBody
	public Category saveCategory(@RequestBody Category category) {
		return service.saveCategory(category);
	}

	@RequestMapping(value = "/category/{categoryID}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteCategory(@PathVariable long categoryID) {
		service.removeCategory(categoryID);
	}

	// Product
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	@ResponseBody
	public List<Product> getAllProduct() {
		return service.getAllProduct();
	}

	@RequestMapping(value = "/products/{productID}", method = RequestMethod.GET)
	@ResponseBody
	public Product getProduct(@PathVariable("productID") long productID) {
		return service.getByIDProduct(productID);
	}

	@RequestMapping(value = "/product", method = RequestMethod.POST)
	@ResponseBody
	public Product saveProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}

	@RequestMapping(value = "/product/{productID}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProduct(@PathVariable long productID) {
		service.removeProduct(productID);
	}

}
