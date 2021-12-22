package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Libro
 *
 */
@Entity
@Table(name="\"Libro\"")
public class Libro implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	private String isbn;
	private int numeropagina;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "libro")
	private List<Capitulo> capitulos;
	
	
	public Libro(int codigo, String nombre, String isbn, int numeropagina) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.isbn=isbn;
		this.numeropagina=numeropagina;
		
	}
	public Libro() {
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
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getNumeropagina() {
		return numeropagina;
	}
	public void setNumeropagina(int numeropagina) {
		this.numeropagina = numeropagina;
	}
	
	public List<Capitulo> getCapitulos() {
		return capitulos;
	}
	public void setCapitulos(List<Capitulo> capitulos) {
		this.capitulos = capitulos;
	}

	
   
}
