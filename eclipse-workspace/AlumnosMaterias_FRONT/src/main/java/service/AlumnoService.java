package service;

import dto.AlumnoDTO;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AlumnoService {
	@Value("{backend.url}")
	private String backendUrl;
	
	private final RestTemplate restTemplate = new RestTemplate();
	
	public List<AlumnoDTO> findAll() {
		String url = backendUrl + "/alumnos";
		return List.of(restTemplate.getForObject(url, AlumnoDTO[].class));
	}

}
