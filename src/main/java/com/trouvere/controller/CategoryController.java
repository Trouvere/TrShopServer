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

@RestController

@RequestMapping(value = "/category")

public class CategoryController {
	@Autowired
	private CategoryService service;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Category> getAllCategory() {
		return service.getAllCategory();
	}

	@RequestMapping(value = "/{categoryID}", method = RequestMethod.GET)
	@ResponseBody
	public Category getByIDCategory(@PathVariable("categoryID") long categoryID) {
		return service.getByIDCategory(categoryID);
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public Category saveCategory(@RequestBody Category category) {
		return service.saveCategory(category);
	}

	@RequestMapping(value = "/{categoryID}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteCategory(@PathVariable long categoryID) {
		service.removeCategory(categoryID);
	}

	@RequestMapping(value = "/{categoryID}/product", method = RequestMethod.GET)
	@ResponseBody
	public List<Product> getByCategoryProduct(@PathVariable long categorytId) {
		return service.getByCategoryIDProduct(categorytId);
	}

}
