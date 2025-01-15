package controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import models.Alumno;
import models.Materia;
import models.User;
import service.AlumnoService;
import service.MateriaService;
import service.UserService;
import securiry.JwtTokenProvider;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {
    @Autowired
    private AlumnoService alumnoService;

    @GetMapping
    public List<Alumno> findAll() {
        return alumnoService.findAll();
    }

    @PostMapping
    public Alumno save(@RequestBody Alumno alumno) {
        return alumnoService.save(alumno);
    }
}
