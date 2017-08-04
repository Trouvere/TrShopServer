package com.trouvere.KTP.service;

import java.util.List;

import com.trouvere.KTP.entity.TypeKTP;

public interface TypeKTPService {

	List<TypeKTP> getAll();

	List<String> getAllValue();

	TypeKTP getByID(long id);

	TypeKTP getByValue(String obj);

	TypeKTP save(TypeKTP obj);

	void remove(long id);

}
