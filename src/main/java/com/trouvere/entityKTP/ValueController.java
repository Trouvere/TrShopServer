package com.trouvere.entityKTP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(value = "/value")

public class ValueController {
	@Autowired
	private TypeKTPService typeKTPService;
	@Autowired
	private PowerService powerService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public ModelAllValueKTP getAll() {

		return new ModelAllValueKTP(getAllTypeKTP(), getAllPower());
	}

	@RequestMapping(value = "/typeKTP", method = RequestMethod.GET)
	@ResponseBody
	public List<String> getAllTypeKTP() {
		return typeKTPService.getAllValue();
	}

	@RequestMapping(value = "/power", method = RequestMethod.GET)
	@ResponseBody
	public List<String> getAllPower() {
		return powerService.getAllValue();
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public TypeKTP save(@RequestBody TypeKTP typeKTP) {
		return typeKTPService.save(typeKTP);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@PathVariable("id") long id) {
		typeKTPService.remove(id);
	}

}
