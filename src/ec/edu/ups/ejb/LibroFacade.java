package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.modelo.Autor;
import ec.edu.ups.modelo.Libro;

@Stateless
public class LibroFacade extends AbstractFacade<Libro> {
	
	@PersistenceContext(unitName = "MunozOrdonez-Maria-Examen")
	private EntityManager em;
	
	public LibroFacade() {
		super(Libro.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

}
