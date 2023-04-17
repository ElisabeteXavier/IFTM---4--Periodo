package com.mycompany.l2.q4;

import java.time.LocalDate;
import java.util.Date;

public class Paciente extends Pessoa {

    private Boolean convenio;
    private String nomeConvenio = null;

    public Boolean isConvenio() {
        return convenio;
    }

    public Boolean getConvenio() {
        return convenio;
    }

    public void setConvenio(Boolean convenio) {
        this.convenio = convenio;
    }

    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public void setNomeConvenio(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }

  

    public Paciente() {

    }

    public Paciente(String nome, String cpf, LocalDate DataNasc, String telefone, Boolean convenio, String nomeConvenio) {
        this.nome = nome;
        this.cpf = cpf;
        this.DataNasc = DataNasc;
        this.telefone = telefone;
        this.convenio = convenio;
        this.nomeConvenio = nomeConvenio;

    }

    @Override
    public String toString() {
        return "Paciente{" + "nome=" + nome + ", cpf=" + cpf + ", DataNasc=" + DataNasc + ", telefone=" + telefone + ",convenio=" + convenio +",Nome Convenio=" + nomeConvenio + '}';
    }

}
