
package br.edu.iftm.elisabete.logic;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author elisabete
 */
public interface GenericLogic<E> extends Serializable{
    
    public E salvar(E entity);
    public void remover(E entity);
    public List<E> listar();
    
}
