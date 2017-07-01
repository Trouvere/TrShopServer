package com.trouvere.entityKTP;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PowerRepository extends CrudRepository<Power, Long> {

	Power findOneByValue(String obj);

}
