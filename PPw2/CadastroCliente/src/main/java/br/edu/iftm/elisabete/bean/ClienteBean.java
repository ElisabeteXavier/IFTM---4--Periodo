package br.edu.iftm.elisabete.bean;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import br.edu.iftm.elisabete.entity.Cliente;
import br.edu.iftm.elisabete.logic.ClienteLogic


    
@Named
@SessionScoped
public class ClienteBean extends GenericBean<Cliente, ClienteLogic>{

    @Inject
    private ClienteLogic logic;
    
    @Override
    public ClienteLogic getLogic() {
        return logic;
    }

    @Override
    public Class<Cliente> getClassEntity() {
        return Cliente.class;
    }
    
    
}
