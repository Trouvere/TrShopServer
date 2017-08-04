package com.trouvere.KTP.repositori;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trouvere.KTP.entity.TypeKTP;

@Repository
public interface TypeKTPRepository extends CrudRepository<TypeKTP, Long> {

	TypeKTP findOneByValue(String obj);

}
