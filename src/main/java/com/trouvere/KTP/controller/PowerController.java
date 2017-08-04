package com.trouvere.KTP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.trouvere.KTP.entity.Power;
import com.trouvere.KTP.service.PowerService;

@RestController

@RequestMapping(value = "/power")

public class PowerController {
	@Autowired
	private PowerService service;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Power> getAll() {
		return service.getAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Power getByID(@PathVariable("id") long id) {
		return service.getByID(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public Power save(@RequestBody Power power) {
		System.out.println(power);
		return service.save(power);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@PathVariable("id") long id) {
		service.remove(id);
	}

}
