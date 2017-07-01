package com.trouvere.entityKTP;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PowerServiceImpl implements PowerService {

	@Autowired
	private PowerRepository repository;

	@Override
	public List<Power> getAll() {
		return (List<Power>) repository.findAll();
	}

	@Override
	public List<String> getAllValue() {
		List<Power> l = (List<Power>) repository.findAll();
		List<String> s = new ArrayList<String>();
		for (int i = 0; i < l.size(); i++) {
			s.add(Double.toString(l.get(i).getValue()));

		}

		return s;
	}

	@Override
	public Power getByID(long id) {
		return repository.findOne(id);
	}

	@Override
	public Power getByValue(String obj) {
		return repository.findOneByValue(obj);
	}

	@Override
	public Power save(Power obj) {
		return repository.save(obj);
	}

	@Override
	public void remove(long id) {
		repository.delete(id);
	}

}
