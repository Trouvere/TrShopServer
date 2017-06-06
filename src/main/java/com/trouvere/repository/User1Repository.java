package com.trouvere.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trouvere.entity.User1;

@Repository
public interface User1Repository extends CrudRepository<User1, Long> {

}
