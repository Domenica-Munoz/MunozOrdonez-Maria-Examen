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

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@RequestScoped
public class CrearAutores implements Serializable{
	
	@EJB
	private AutorFacde autorejb;
	
	@EJB
	private CapituloFacade capituloejb;
	
	@EJB
	private LibroFacade libroejb;
	
	private String nombreAutor;
	private String titulo;
	private List<Capitulo> capitulos = new ArrayList<Capitulo>();
	
	public void crear() {
		
		Autor autor=new Autor(0, "Gabriel Garcia Marquez", "Colombia");
		Autor autor1=new Autor(0, "Emilio Ortiz", "Espana");
		Autor autor2=new Autor(0, " William shakespeare", "Inglaterra");
		autorejb.create(autor);
		autorejb.create(autor1);
		autorejb.create(autor2);
	}
	
	public void prueba() {
		this.capitulos = this.libroejb.bucarPorTitulo(this.titulo);
	}
	
	public void prueba2() {
		this.capitulos = this.libroejb.bucarPorAutor(this.nombreAutor);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Capitulo> getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(List<Capitulo> capitulos) {
		this.capitulos = capitulos;
	}

	public String getNombreAutor() {
		return nombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}
	
	

}
