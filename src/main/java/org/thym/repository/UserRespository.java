package org.thym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.thym.entities.User;

public interface UserRespository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
