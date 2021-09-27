package mx.com.citi.demo.dao;
 
import java.util.List;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import mx.com.citi.demo.model.Cliente;
 
public class ClienteDAOImpl implements ClienteDAO {
     
 
    private SessionFactory sessionFactory;
     
	public ClienteDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
 
    @Override
    public void addCliente(Cliente c) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(c);
    }
 
    @Override
    public void updateCliente(Cliente c) {
    	Session session = this.sessionFactory.getCurrentSession();
        session.update(c);
    }
 
	@Override 
	public List<Cliente> listClientes() { 
		Session session = this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Cliente> clientesList = (List<Cliente>) session.createQuery(" from Cliente ").list(); 
		return clientesList; 
	}
	 
    @Override
    public Cliente getClienteById(Long id) {
        Session session = this.sessionFactory.getCurrentSession();      
        Cliente c = (Cliente) session.get(Cliente.class, id);
        return c;
    }
 
    @Override
    public void removeCliente(Long id) {
        Session session = this.sessionFactory.getCurrentSession();
        Cliente c = (Cliente) session.load(Cliente.class, id);
        if(null != c){
            session.delete(c);
        }
    }
 
}