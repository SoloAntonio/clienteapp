package mx.com.citi.demo.dao;
 
import java.util.List;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import mx.com.citi.demo.model.Estado;
 
public class EstadoDAOImpl implements EstadoDAO {
     
    private SessionFactory sessionFactory;
    
	public EstadoDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
     
    @Override
    public void addEstado(Estado c) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(c);
    }
 
    @Override
    public void updateEstado(Estado c) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(c);
    }
 
    @SuppressWarnings("unchecked")
    @Override
    public List<Estado> listEstados() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Estado> EstadosList = session.createQuery("from Estado").list();
        return EstadosList;
    }
 
    @Override
    public Estado getEstadoById(Long id) {
        Session session = this.sessionFactory.getCurrentSession();      
        Estado c = (Estado) session.get(Estado.class, id);
        return c;
    }
 
    @Override
    public void removeEstado(Long id) {
        Session session = this.sessionFactory.getCurrentSession();
        Estado c = (Estado) session.load(Estado.class, id);
        if(null != c){
            session.delete(c);
        }
    }
 
}