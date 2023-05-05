/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.iftm.elisabete.bean;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.Getter;
import br.edu.iftm.elisabete.util.BeanUtil;
import br.edu.iftm.elisabete.logic.GenericLogic;

public abstract class GenericBean<E, L extends GenericLogic<E>> extends BeanUtil{
    
    @Getter
    private E entity;
    @Getter
    private List<E> entitys;
    
    @Getter
    private Estado estado = Estado.PESQUISANDO;
       
    enum Estado {
        CRIANDO,
        EDITANDO,
        PESQUISANDO
    }
    
    public void newInstanceOfEntity(){
        try {
            entity = (E) getClassEntity().getConstructors()[0].newInstance();
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(GenericBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void novo(){
        newInstanceOfEntity();
        estado = Estado.CRIANDO;
    }
  
    public void salvar(){
        getLogic().salvar(entity);
        addInfo("Salvo com sucesso.");
        newInstanceOfEntity();
        estado = Estado.PESQUISANDO;
    }
    
    
    public void listar(){
        estado = Estado.PESQUISANDO;
        entitys = getLogic().listar();
    }
    
    public void remover(E entity){
        getLogic().remover(entity);
        addInfo("Removido com sucesso.");
    }
    public void editar(E entity) {
        this.entity = entity;
        estado = Estado.EDITANDO;
    }
    public abstract L getLogic();
    public abstract Class<E> getClassEntity();
}

