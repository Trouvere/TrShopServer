package com.trouvere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trouvere.entity.User;

/**
 * Created by stephan on 20.03.16.
 */
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
