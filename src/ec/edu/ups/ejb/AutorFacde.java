package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.modelo.Autor;

@Stateless
public class AutorFacde extends AbstractFacade<Autor> {
	
	@PersistenceContext(unitName = "MunozOrdonez-Maria-Examen")
	private EntityManager em;
	
	public AutorFacde() {
		super(Autor.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

}
