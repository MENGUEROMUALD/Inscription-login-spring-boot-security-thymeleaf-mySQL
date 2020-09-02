package org.thym.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.thym.entities.User;
import org.thym.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService  {
 
	User save(UserRegistrationDto dto);
}
