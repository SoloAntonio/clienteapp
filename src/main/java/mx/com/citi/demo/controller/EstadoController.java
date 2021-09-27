package mx.com.citi.demo.controller;
 
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mx.com.citi.demo.model.Estado;
import mx.com.citi.demo.service.EstadoService;

@ResponseBody
@RequestMapping(value = "/estados", produces = { MediaType.APPLICATION_JSON_VALUE })
public class EstadoController {
    
    private EstadoService estadoService;
     
    public void setEstadoService(EstadoService ps){
        this.estadoService = ps;
    }
     
    @RequestMapping(method = RequestMethod.GET)
    public List<Estado> listEstados() {
        return this.estadoService.listEstados();
    }
     
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Estado getEstadoById(@PathVariable("id") Long id) {
        return this.estadoService.getEstadoById(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public Estado addEstado(@RequestBody Estado p){
         
        if(p.getId() == 0){
            this.estadoService.addEstado(p);
        }
        return p;
         
    }
     
    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public void removeEstado(@PathVariable("id") Long id){
        this.estadoService.removeEstado(id);
    }
  
    @RequestMapping(value="/{id}", method = RequestMethod.PUT)
    public Estado editEstado(@PathVariable("id") Long id, @RequestBody Estado estado){
    	if(estado.getId() > 0){
            this.estadoService.updateEstado(estado);
        }
        return estado;
    }
     
}