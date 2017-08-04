package com.trouvere.KTP.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trouvere.KTP.entity.TypeKTP;
import com.trouvere.KTP.repositori.TypeKTPRepository;

@Service
public class TypeKTPServiceImpl implements TypeKTPService {

	@Autowired
	private TypeKTPRepository repository;

	@Override
	public List<TypeKTP> getAll() {
		return (List<TypeKTP>) repository.findAll();
	}

	@Override
	public List<String> getAllValue() {
		List<TypeKTP> l = (List<TypeKTP>) repository.findAll();
		List<String> s = new ArrayList<String>();
		for (int i = 0; i < l.size(); i++) {
			s.add(l.get(i).getValue());
		}

		return s;
	}

	@Override
	public TypeKTP getByID(long id) {
		return repository.findOne(id);
	}

	@Override
	public TypeKTP getByValue(String obj) {
		return repository.findOneByValue(obj);
	}

	@Override
	public TypeKTP save(TypeKTP obj) {
		return repository.save(obj);
	}

	@Override
	public void remove(long id) {
		repository.delete(id);
	}

}
