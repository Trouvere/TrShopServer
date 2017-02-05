package com.trouvere.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trouvere.entity.Orders;

@Repository
public interface OrderRepository extends CrudRepository<Orders, Long> {

}
