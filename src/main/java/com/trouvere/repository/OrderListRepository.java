package com.trouvere.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trouvere.entity.OrdersList;

@Repository
public interface OrderListRepository extends CrudRepository<OrdersList, Long> {

}
