package com.trouvere.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trouvere.entity.Category;
import com.trouvere.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

	List<Product> findAll();

	List<Product> findByCategory(Category category);

}
