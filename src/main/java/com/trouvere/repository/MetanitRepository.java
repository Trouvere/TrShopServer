package com.trouvere.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trouvere.entity.Metanit;

@Repository
public interface MetanitRepository extends CrudRepository<Metanit, Long> {

}
