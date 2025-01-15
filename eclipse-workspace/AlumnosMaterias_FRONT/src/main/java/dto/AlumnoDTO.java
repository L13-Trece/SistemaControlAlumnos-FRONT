package dto;

import java.util.Set;

public class AlumnoDTO {
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Set<MateriaDTO> getMateriaList() {
		return materiaList;
	}
	public void setMateriaList(Set<MateriaDTO> materiaList) {
		this.materiaList = materiaList;
	}
	private Long id;
	private String rut;
	private String nombre;
	private String direccion;
	private Set<MateriaDTO> materiaList;

}
