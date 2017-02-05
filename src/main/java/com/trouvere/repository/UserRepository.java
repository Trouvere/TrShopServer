package com.trouvere.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trouvere.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
