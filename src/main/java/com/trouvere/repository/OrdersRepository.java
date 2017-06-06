package com.trouvere.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trouvere.entity.Orders;
import com.trouvere.entity.User1;

@Repository
public interface OrdersRepository extends CrudRepository<Orders, Long> {

	List<Orders> findByUser(User1 user);

}
