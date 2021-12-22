package ec.edu.ups.controladores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import org.jboss.weld.context.ejb.Ejb;

import ec.edu.ups.ejb.CapituloFacade;
import ec.edu.ups.modelo.Capitulo;
import ec.edu.ups.modelo.Libro;


@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@RequestScoped
public class busqueda implements Serializable {
	
	@Ejb
	private CapituloFacade ejbcapitulo;
	
	private String titulo;
	private List<Capitulo> libros = new ArrayList<Capitulo>();
	
	public void buscarPorTitulo() {
		libros=this.ejbcapitulo.bucarcapitulo(this.titulo);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Capitulo> getLibros() {
		return libros;
	}

	public void setLibros(List<Capitulo> libros) {
		this.libros = libros;
	}
	

}
