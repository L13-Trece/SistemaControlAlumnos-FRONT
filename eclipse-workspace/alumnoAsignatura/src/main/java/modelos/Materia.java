package modelos;

import java.util.ArrayList;
import java.util.List;

public class Materia {
	private MateriaEnum nombre; 
	private List<Double> notas;
	
	//Constructor
	
	public Materia (MateriaEnum nombre) {
		this.nombre = nombre;
		this.notas = new ArrayList<>();
	}

	// Getters y Setters
	

	public MateriaEnum getNombre() {
		return nombre;
	}

	public void setNombre(MateriaEnum nombre) {
		this.nombre = nombre;
	}

	
	public List<Double> getNotas() {
		return notas;
	}

	public void setNotas(List<Double> notas) {
		this.notas = notas;
	}

	
	//Metodo para añadir notas
	
	public void addNota(double nota) {
		this.notas.add(nota);
	}
	
}
