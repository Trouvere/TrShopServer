package com.trouvere.KTP.service;

import java.util.List;

import com.trouvere.KTP.entity.Power;

public interface PowerService {

	List<Power> getAll();

	List<String> getAllValue();

	Power getByID(long id);

	Power getByValue(String obj);

	Power save(Power obj);

	void remove(long id);

}
