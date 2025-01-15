package repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import models.Alumno;
import models.Materia;
import models.User;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {}