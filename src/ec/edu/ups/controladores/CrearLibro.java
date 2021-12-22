package ec.edu.ups.controladores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.AutorFacde;
import ec.edu.ups.ejb.CapituloFacade;
import ec.edu.ups.ejb.LibroFacade;
import ec.edu.ups.modelo.Autor;
import ec.edu.ups.modelo.Capitulo;
import ec.edu.ups.modelo.Libro;


@Named
@RequestScoped
public class CrearLibro implements Serializable{
	
	@EJB
	private AutorFacde autorejb;
	
	@EJB
	private CapituloFacade capituloejb;
	
	@EJB
	private LibroFacade libroejb;
	
	private String nombre;
	private String isbn;
	private int nPaginas;
	private int nCapitulos;
	public static List<Capitulo> capitulos=new ArrayList<Capitulo>();
	private List<Capitulo> capitulosMod=new ArrayList<Capitulo>();
	public static List<Autor> autores=new ArrayList<Autor>();
	private String autor;
	private int numeroCapitulo;
	private String tituloCapitulo;
	
	public void cargarAutores() {
		System.out.println("********************************");
		this.autores=this.autorejb.findAll();
	}
	
	public void addCapitulos() {
		System.out.println("********************************");
		System.out.println(this.numeroCapitulo);
		System.out.println(this.tituloCapitulo);
		System.out.println(this.autor);
		Autor aut=this.autorejb.find(Integer.parseInt(autor));
		Capitulo cap = new Capitulo(0, this.numeroCapitulo, this.tituloCapitulo, null, aut);
		this.capitulos.add(cap);
	}
	
	public void guardar () {
		Libro lib = new Libro(0, this.nombre, this.isbn, this.nPaginas);
		this.libroejb.create(lib);
		for (Capitulo cap : this.capitulos) {
			cap.setLibro(lib);
			this.capituloejb.create(cap);
		}
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
	public int getnPaginas() {
		return nPaginas;
	}
	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}
	public int getnCapitulos() {
		return nCapitulos;
	}
	public void setnCapitulos(int nCapitulos) {
		this.nCapitulos = nCapitulos;
	}

	public List<Capitulo> getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(List<Capitulo> capitulos) {
		this.capitulos = capitulos;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public List<Capitulo> getCapitulosMod() {
		return capitulosMod;
	}

	public void setCapitulosMod(List<Capitulo> capitulosMod) {
		this.capitulosMod = capitulosMod;
	}

	public int getNumeroCapitulo() {
		return numeroCapitulo;
	}

	public void setNumeroCapitulo(int numeroCapitulo) {
		this.numeroCapitulo = numeroCapitulo;
	}

	public String getTituloCapitulo() {
		return tituloCapitulo;
	}

	public void setTituloCapitulo(String tituloCapitulo) {
		this.tituloCapitulo = tituloCapitulo;
	}
	
	
	
}
