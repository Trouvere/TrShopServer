package com.trouvere.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trouvere.entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
