package mx.com.citi.demo.controller;
 
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mx.com.citi.demo.model.Cliente;
import mx.com.citi.demo.service.ClienteService;

@ResponseBody
@RequestMapping(value = "/clientes", produces = { MediaType.APPLICATION_JSON_VALUE })
public class ClienteController {
    
    private ClienteService clienteService;
    
    public void setClienteService(ClienteService ps){
        this.clienteService = ps;
    }
     
    @RequestMapping(method = RequestMethod.GET)
    public List<Cliente> listClientes() {
        return this.clienteService.listClientes();
    }
     
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Cliente getClienteById(@PathVariable("id") Long id) {
        return this.clienteService.getClienteById(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public Cliente addCliente(@RequestBody Cliente c){
         
        if(c.getId() == 0){
            this.clienteService.addCliente(c);
        }
        return c;
         
    }
     
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE )
    public void removeCliente(@PathVariable("id") Long id){
        this.clienteService.removeCliente(id);
    }
  
    @RequestMapping(value="/{id}", method = RequestMethod.PUT)
    public Cliente editCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente){
    	if(cliente.getId() > 0){
            this.clienteService.updateCliente(cliente);
        }
        return cliente;
    }
     
}