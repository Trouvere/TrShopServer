package com.trouvere.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trouvere.entity.Heroesserv;

@Repository
public interface HeroesRepository extends CrudRepository<Heroesserv, Long> {

}