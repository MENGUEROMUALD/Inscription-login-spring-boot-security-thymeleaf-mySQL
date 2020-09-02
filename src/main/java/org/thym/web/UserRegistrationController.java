package org.thym.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thym.service.UserService;
import org.thym.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("user")
	public UserRegistrationDto dto() {
		return new UserRegistrationDto();
	}
	
	@GetMapping
	public String showRegistration() {
		//model.addAttribute("user", new UserRegistrationDto());
		return "registration";
	}
	
	@PostMapping
	public String registrationUserAccount(@ModelAttribute("user") UserRegistrationDto userdto) {
		userService.save(userdto);
		return "redirect:/registration?success";
	}
}
