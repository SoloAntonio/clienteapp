package mx.com.citi.demo.service;
 
import java.util.List;
 
import mx.com.citi.demo.dao.EstadoDAO;
import mx.com.citi.demo.model.Estado;
 
 
public class EstadoServiceImpl implements EstadoService {
     
    private EstadoDAO estadoDAO;
 
    public void setEstadoDAO(EstadoDAO estadoDAO) {
        this.estadoDAO = estadoDAO;
    }
 
    @Override
    public void addEstado(Estado p) {
        this.estadoDAO.addEstado(p);
    }
 
    @Override
    public void updateEstado(Estado p) {
        this.estadoDAO.updateEstado(p);
    }
 
    @Override
    public List<Estado> listEstados() {
        return this.estadoDAO.listEstados();
    }
 
    @Override
    public Estado getEstadoById(Long id) {
        return this.estadoDAO.getEstadoById(id);
    }
 
    @Override
    public void removeEstado(Long id) {
        this.estadoDAO.removeEstado(id);
    }
 
}