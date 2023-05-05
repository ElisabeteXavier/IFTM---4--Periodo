package br.edu.iftm.elisabete.logic;

import java.util.ArrayList;
import java.util.List;
import br.edu.iftm.elisabete.entity.Cliente;

/**
 *
 * @author elisabete
 */
public class ClienteLogic implements GenericLogic<Cliente> {

    private List<Cliente> clientes = new ArrayList<>();
    private Long id = 1L;
    
    @Override
    public Cliente salvar(Cliente entity) {
        entity.setId(id++);
        clientes.add(entity);
        return entity;
    }

    @Override
    public void remover(Cliente entity) {
        clientes.remove(entity);
    }

    @Override
    public List<Cliente> listar() {
        return clientes;
    }
    
}