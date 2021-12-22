package ec.edu.ups.controladores;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Navigator {

	public Navigator() {
		
	}
	
	public String reglaRedir( String page ) {
			
			if(page.equals("Buscar")) {
				return "buscar";
			}else if(page.equals("CrearLibro")) {
				return "crearlibro";
			}else if(page.equals("Index")) {
				return "index";
			}
			
			return page;
			
	}
}
