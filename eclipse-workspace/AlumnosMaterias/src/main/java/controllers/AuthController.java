package controllers;

import java.util.HashMap;
import java.util.Map;

import securiry.JwtTokenProvider;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenProvider tokenProvider;

    @PostMapping("/signin")
    public Map<String, String> authenticateUser(@RequestParam String username, @RequestParam String password) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(username, password));

        String token = tokenProvider.generateToken(authentication);
        Map<String, String> response = new HashMap<>();
        response.put("token", token);

        return response;
    }
}
