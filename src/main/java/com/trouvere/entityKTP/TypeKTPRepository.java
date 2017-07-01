package com.trouvere.entityKTP;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeKTPRepository extends CrudRepository<TypeKTP, Long> {

	TypeKTP findOneByValue(String obj);

}
