package mx.com.citi.demo.service;
 
import java.util.List;
 

import mx.com.citi.demo.dao.ClienteDAO;
import mx.com.citi.demo.model.Cliente;
 
 
public class ClienteServiceImpl implements ClienteService {
     
    private ClienteDAO clienteDAO;
 
    public void setClienteDAO(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }
 
    @Override
    public void addCliente(Cliente p) {
        this.clienteDAO.addCliente(p);
    }
 
    @Override
    public void updateCliente(Cliente p) {
        this.clienteDAO.updateCliente(p);
    }
 
    @Override
    public List<Cliente> listClientes() {
        return this.clienteDAO.listClientes();
    }
 
    @Override
    public Cliente getClienteById(Long id) {
        return this.clienteDAO.getClienteById(id);
    }
 
    @Override
    public void removeCliente(Long id) {
        this.clienteDAO.removeCliente(id);
    }
 
}