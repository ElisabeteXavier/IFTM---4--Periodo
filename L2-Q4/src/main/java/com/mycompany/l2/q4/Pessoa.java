
package com.mycompany.l2.q4;

import java.time.LocalDate;

public abstract class Pessoa {
    
   protected String nome;
   protected String cpf;
   protected LocalDate DataNasc;
   protected String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(LocalDate DataNasc) {
        this.DataNasc = DataNasc;
    }

 

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
   
   
}
