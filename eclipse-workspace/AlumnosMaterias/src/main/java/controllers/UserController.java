package controllers;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public Map<String, String> signup(@RequestBody User user) {
        userService.signup(user);
        Map<String, String> response = new HashMap<>();
        response.put("message", "Usuario registrado exitosamente.");
        return response;
    }

    @PostMapping("/signin")
    public Map<String, String> signin(@RequestParam String username, @RequestParam String password) {
        String token = userService.signin(username, password);
        Map<String, String> response = new HashMap<>();
        response.put("token", token);
        return response;
    }
}

