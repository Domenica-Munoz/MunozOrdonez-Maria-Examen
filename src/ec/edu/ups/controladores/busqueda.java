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

@Named
@RequestScoped
public class busqueda implements Serializable {
	
	@Ejb
	private CapituloFacade ejbcapitulo;
	
	private String titulo;
	private List<Capitulo> capitulos = new ArrayList<Capitulo>();
	
	public void buscarPorTitulo() {
		Capitulo cap = this.ejbcapitulo.find(1);
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
	
	

}
