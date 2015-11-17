package ua.ivanskyi.rozetka.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.ivanskyi.rozetka.service.UserService;

@Controller
@RequestMapping(value="/registration")
public class RegistrationController {

	@Inject
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public String registrationForm() {
		return "registration";
	}

	@RequestMapping(value = "/addNewUser", method = RequestMethod.POST)
	public String addNewUser(@RequestParam String userName, @RequestParam String userEmail,
			@RequestParam String userLogin, @RequestParam String userPassword) {

		userService.saveUser(userName, userEmail, userLogin, userPassword);

		return "redirect:/home";
	}
}
