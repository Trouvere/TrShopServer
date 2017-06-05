package com.trouvere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.trouvere.entity.Metanit;
import com.trouvere.repository.MetanitRepository;

@Controller
// @CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/metanit")
public class MetanitController {
	@Autowired
	// Если 2 репозитория, то появляется глюк!!!
	// private HeroesRepository service;
	private MetanitRepository met2;

	@RequestMapping(value = "/m", method = RequestMethod.GET)
	@ResponseBody
	public List<Metanit> getAllMetanit() {
		return (List<Metanit>) met2.findAll();
	}

}
