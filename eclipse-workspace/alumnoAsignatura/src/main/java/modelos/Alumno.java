package modelos;

import java.util.ArrayList;
import java.util.List;


public class Alumno {
	private String rut;
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private List<Materia> materias;
	
	
	//Constructor
	
	public Alumno (String rut, String nombre, String apellido, String direccion, int edad) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.materias = new ArrayList<>();
		
	}

	
	//Getters & Setters

	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}

	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public List<Materia> getMaterias() {
		return materias;
	}
	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}
	
	
	
}
	
	







