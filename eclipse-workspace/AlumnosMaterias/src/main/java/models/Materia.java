package models;

@Entity
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "alumno_id")
    private Alumno alumno;

    // Getters y Setters
}
