package com.mycompany.l2.q4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class GerenciarPaciente implements Gerenciador {

    private ArrayList<Paciente> pacientes;
    private Scanner sc;

    public GerenciarPaciente() {

        sc = new Scanner(System.in);
        pacientes = new ArrayList<Paciente>();
    }

    public void cadastrar() {
        String nome, cpf, telefone, dataNasc, nomeConvenio, pergunta;
        boolean convenio;
        LocalDate nasc;

        System.out.println("Informe o nome: ");
        nome = sc.nextLine();
        System.out.println("Informe o cpf: ");
        cpf = sc.nextLine();
        System.out.println("Informe a data de nascimento: ");
        dataNasc = sc.nextLine();
        System.out.println("Informe o telefone: ");
        telefone = sc.nextLine();
        System.out.println("Possui Convenio ? S ou N ");
        pergunta = sc.nextLine();
        if (pergunta.toUpperCase().equals("S")) {
            System.out.println("Informe o convenio: ");
            nomeConvenio = sc.nextLine();
        } else {
            nomeConvenio = "";
        }

        convenio = pergunta.trim().toUpperCase().substring(0, 1).equals("S");

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        nasc = LocalDate.parse(dataNasc, formatador);

        pacientes.add(new Paciente(nome, cpf, nasc, telefone, convenio, nomeConvenio));

    }

    public void atualizar() {
        String nome, cpf, telefone, nomeConvenio, nascimento;
        int alteracaoFeita, retorno;
        LocalDate dataNasc;
        Paciente paciente = null;

        System.out.println("ATUALIZAÇÃO DE PACIENTE");
        System.out.println("Informe o cpf: ");
        cpf = sc.nextLine();

        for (Paciente p : pacientes) {

            if (p.getCpf().equals(cpf)) {
                paciente = p;
            }
        }
        if (paciente != null) {
            do {

                System.out.println("\nO que deseja alterar? ");
                System.out.println("1 - Nome do Paciente ");
                System.out.println("2 - Data de nascimento do Paciente ");
                System.out.println("3 - Telefone do  Paciente");
                System.out.println("4 - CPF do Paciente ");
                System.out.println("5 - Nome do Covenio do Paciente ");
                alteracaoFeita = sc.nextInt();
                sc.skip("\n");

                switch (alteracaoFeita) {
                    case 1: {
                        System.out.print("Novo Nome: ");
                        nome = sc.nextLine();
                        paciente.setNome(nome);
                        break;
                    }
                    case 2: {
                        System.out.print("Nova Data de nascimento: ");
                        nascimento = sc.nextLine();
                        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        dataNasc = LocalDate.parse(nascimento, formatador);
                        paciente.setDataNasc(dataNasc);
                        break;
                    }
                    case 3: {
                        System.out.print("Novo Telefone: ");
                        telefone = sc.nextLine();
                        paciente.setTelefone(telefone);
                        break;
                    }
                    case 4: {
                        System.out.print("Novo CPF ");
                        cpf = sc.nextLine();
                        paciente.setCpf(cpf);
                        break;
                    }
                    case 5: {

                        if (paciente.getConvenio() == Boolean.TRUE) {
                            System.out.print("Novo Convenio ");
                            nomeConvenio = sc.nextLine();
                            paciente.setNomeConvenio(nomeConvenio);
                        } else {
                            System.out.println("Paciente não possuí convenio");
                        }
                        break;

                    }
                    default:
                        System.out.println("Operação inválida!");

                }

                System.out.println("\nDeseja alterar mais alguma coisa?");
                System.out.println("1- Sim");
                System.out.println("2- Não");
                retorno = sc.nextInt();
                sc.skip("\n");
            } while (retorno == 1);
        } else {
            System.out.println("\nProfessor não encontrado!");
        }

    }

    public void consultar() {

        System.out.println(pacientes);

    }

    public void deletar() {
        String cpf;
        
        System.out.println("EXCLUSÃO DE PACIENTE");
        System.out.println("Informe o cpf: ");
        cpf = sc.nextLine();
        Paciente paciente = null;

        for (Paciente p : pacientes) {

            if (p.getCpf().equals(cpf)) 
                paciente = p;
            
        }
        System.out.println("\nConfirma a exclusão?");
        System.out.println("1- Sim\n2-Não");
        int confirmacao = sc.nextInt();
        sc.skip("\n");
        if (confirmacao == 1 && paciente != null) {
          pacientes.remove(paciente);
            System.out.println("\nPaciente excluído");
        } else System.out.println("\nOperação cancelada\n");
    }

        
      
        
        

    }


