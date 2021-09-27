package mx.com.citi.demo.service;
 
import java.util.List;

import mx.com.citi.demo.model.Estado;
 
public interface EstadoService {
 
    public void addEstado(Estado p);         
    public void updateEstado(Estado p);
    public List<Estado> listEstados();
    public Estado getEstadoById(Long id);
    public void removeEstado(Long id);
}