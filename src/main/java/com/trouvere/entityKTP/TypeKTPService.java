package com.trouvere.entityKTP;

import java.util.List;

public interface TypeKTPService {

	List<TypeKTP> getAll();

	List<String> getAllValue();

	TypeKTP getByID(long id);

	TypeKTP getByValue(String obj);

	TypeKTP save(TypeKTP obj);

	void remove(long id);

}
