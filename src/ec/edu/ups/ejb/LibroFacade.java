package ec.edu.ups.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.modelo.Autor;
import ec.edu.ups.modelo.Capitulo;
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
	
	public List<Capitulo> bucarPorTitulo(String titulo){
		List<Capitulo> ca=new ArrayList<Capitulo>();
		String consulta="Select ca from Capitulo ca where ca.titulo='"+titulo+"'";
		try {
			ca=(List<Capitulo>)em.createQuery(consulta).getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(">>>Warning(CaoituloFacde:bucarPorTitulo)"+e.getMessage());
		}
		return ca;
	}
    
	public List<Capitulo> bucarPorAutor(String nombre){
		List<Capitulo> ca=new ArrayList<Capitulo>();
		String consulta="Select ca from Capitulo ca where ca.autor.nombre='"+nombre+"'";
		try {
			ca=(List<Capitulo>)em.createQuery(consulta).getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(">>>Warning(CaoituloFacde:bucarPorAutor)"+e.getMessage());
		}
		return ca;
	}

}
