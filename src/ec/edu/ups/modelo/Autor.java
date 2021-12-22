package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Autor
 *
 */
@Entity
@Table(name="\"Autor\"")
public class Autor implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	private String nacionalidad;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "autor")
	private List<Capitulo> capitulo;
	
	public Autor(int codigo, String nombre, String nacionalidad) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.nacionalidad=nacionalidad;
		
	}
	
	public Autor() {
		super();
	}
	

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	public List<Capitulo> getCapitulo() {
		return capitulo;
	}

	public void setCapitulo(List<Capitulo> capitulo) {
		this.capitulo = capitulo;
	}
	
	
   
}
