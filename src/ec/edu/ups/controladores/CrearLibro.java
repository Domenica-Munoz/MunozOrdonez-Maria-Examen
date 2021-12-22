package ec.edu.ups.controladores;

import java.io.Serializable;
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


@FacesConfig(version = FacesConfig.Version.JSF_2_3)
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
	private List<Capitulo> capitulos;
	
	public void listaCapitulos() {
		for (int i=0; i<=this.nCapitulos; i++) {
			Libro libro=new Libro();
			Autor autor=new Autor();
			Capitulo cap= new Capitulo(0, 0, "", libro, autor);
			this.capitulos.add(cap);
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
	
}
