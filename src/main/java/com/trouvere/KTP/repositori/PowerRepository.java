package com.trouvere.KTP.repositori;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trouvere.KTP.entity.Power;

@Repository
public interface PowerRepository extends CrudRepository<Power, Long> {

	Power findOneByValue(String obj);

}
