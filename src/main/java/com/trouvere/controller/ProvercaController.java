package com.trouvere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.trouvere.entity.Heroesserv;
import com.trouvere.entity.Metanit;
import com.trouvere.repository.HeroesRepository;
import com.trouvere.repository.MetanitRepository;

@Controller
@RequestMapping("/proverca")
public class ProvercaController {
	@Autowired
	private HeroesRepository service;
	private MetanitRepository service2;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Heroesserv> getAllUser() {
		return (List<Heroesserv>) service.findAll();
	}

	@RequestMapping(value = "/h", method = RequestMethod.GET)
	@ResponseBody
	public String sayHello(@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name) {
		return name;
	}

	@RequestMapping(value = "/m", method = RequestMethod.GET)
	@ResponseBody
	public List<Metanit> getAllMetanit() {
		return (List<Metanit>) service2.findAll();
	}
}
