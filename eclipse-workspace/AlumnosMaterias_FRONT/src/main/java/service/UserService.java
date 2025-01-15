package service;

import dto.UserDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
	@Value("${backendUrl}")
	private String backendUrl;
	
	private final RestTemplate restTemplate = new RestTemplate();
	
	public String signin (UserDTO userDTO) {
		String url = backendUrl + "/auth/signin";
		return restTemplate.postForObject(url,  userDTO,  String.class);
	}

}
