package com.trouvere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.trouvere.entity.Category;
import com.trouvere.entity.Product;
import com.trouvere.service.CategoryService;

//Для просмотра продуктов и категорий
//Доступно для неавторизованных пользователей
@Controller
@RequestMapping("/shop")
public class ShopController {
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
	public Category getCategory(@PathVariable("categoryID") long categoryID) {
		return service.getByIDCategory(categoryID);
	}

	// Product

	// @RequestMapping(value = "/category/{categoryID}/product", method =
	// RequestMethod.GET)
	// @ResponseBody
	// public List<Product> getAllProduct() {
	// return service.getAllProduct();
	// }

	@RequestMapping(value = "/category/{categoryID}/product", method = RequestMethod.GET)
	@ResponseBody
	public List<Product> getByCategoryProduct(@PathVariable long categorytId) {
		return service.getByCategoryIDProduct(categorytId);
	}

	// @RequestMapping(value = "/category/{categoryID}/product/{productID}",
	// method = RequestMethod.GET)
	// @ResponseBody
	// public Product getProduct(@PathVariable("categoryID") long categoryID,
	// @PathVariable("productID") long productID) {
	// return service.getByCategoryIDProduct(categorytId)(productID);
	// }

}
