package mx.com.citi.demo.dao;
 
import java.util.List;

import mx.com.citi.demo.model.Cliente;
 
public interface ClienteDAO {
 
    public void addCliente(Cliente p);         
    public void updateCliente(Cliente p);
    public List<Cliente> listClientes();
    public Cliente getClienteById(Long id);
    public void removeCliente(Long id);
}