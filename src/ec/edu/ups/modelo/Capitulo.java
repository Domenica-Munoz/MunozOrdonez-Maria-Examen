package ec.edu.ups.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Capitulo
 *
 */
@Entity
@Table(name="\"Capitulo\"")
public class Capitulo implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int codigo;
	private int numero;
	private String titulo;
	
	@ManyToOne
	@JoinColumn
	private Libro libro;
	
	@ManyToOne
	@JoinColumn
	private Autor autor;
	
	public Capitulo(int codigo, int numero, String titulo, Libro libro, Autor autor) {
		this.codigo=codigo;
		this.numero=numero;
		this.titulo=titulo;
		this.libro=libro;
		this.autor=autor;
		
	}
	
	public Capitulo() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Capitulo [codigo=" + codigo + ", numero=" + numero + ", titulo=" + titulo + "]";
	}
   
	
}
