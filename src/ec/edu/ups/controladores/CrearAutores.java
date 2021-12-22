package ec.edu.ups.controladores;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.AutorFacde;
import ec.edu.ups.ejb.CapituloFacade;
import ec.edu.ups.ejb.LibroFacade;
import ec.edu.ups.modelo.Autor;

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
	
	public void crear() {
		
		Autor autor=new Autor(0, "Gabriel Garcia Marquez", "Colombia");
		Autor autor1=new Autor(0, "Emilio Ortiz", "Espana");
		Autor autor2=new Autor(0, " William shakespeare", "Inglaterra");
		autorejb.create(autor);
		autorejb.create(autor1);
		autorejb.create(autor2);
	}
	
	

}
