package com.trouvere.KTP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.trouvere.KTP.entity.TypeKTP;
import com.trouvere.KTP.service.TypeKTPService;

@RestController

@RequestMapping(value = "/TypeKTP")

public class TypeKTPController {
	@Autowired
	private TypeKTPService service;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<TypeKTP> getAll() {
		return service.getAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public TypeKTP getByIDCategory(@PathVariable("id") long id) {
		return service.getByID(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public TypeKTP save(@RequestBody TypeKTP typeKTP) {
		return service.save(typeKTP);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@PathVariable("id") long id) {
		service.remove(id);
	}

}
