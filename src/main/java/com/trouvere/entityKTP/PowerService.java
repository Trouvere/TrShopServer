package com.trouvere.entityKTP;

import java.util.List;

public interface PowerService {

	List<Power> getAll();

	List<String> getAllValue();

	Power getByID(long id);

	Power getByValue(String obj);

	Power save(Power obj);

	void remove(long id);

}
