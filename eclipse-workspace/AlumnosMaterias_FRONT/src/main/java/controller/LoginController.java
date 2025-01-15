package controller;

import dto.UserDTO;
import service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String authenticate (UserDTO userDTO, Model model) {
		try {
			String token = userService.signin(userDTO);
			model.addAttribute("token", token);
			return "redirect:/home";
		} catch (Exception e) {
			model.addAttribute ("error", "Usuario o contraseña incorrecta.");
			return "login";
		}
	}
	
}
