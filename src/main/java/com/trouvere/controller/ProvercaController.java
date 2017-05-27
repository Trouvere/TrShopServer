package com.trouvere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.trouvere.entity.Heroes;
import com.trouvere.repository.HeroesRepository;

@Controller
@RequestMapping("/proverca")
public class ProvercaController {
	@Autowired
	private HeroesRepository service;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Heroes> getAllUser() {
		return (List<Heroes>) service.findAll();
	}

}
