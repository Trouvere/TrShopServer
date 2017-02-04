package com.trouvere.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trouvere.entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
	// public interface CategoryRepository {
	List<Category> findAll();

}
