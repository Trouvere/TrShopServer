package com.trouvere.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trouvere.entity.Heroes;

@Repository
public interface HeroesRepository extends CrudRepository<Heroes, Long> {

}
