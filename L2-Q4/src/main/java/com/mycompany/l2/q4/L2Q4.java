package com.mycompany.l2.q4;

import java.util.Scanner;

public class L2Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciarPaciente gerenciarPaciente = new GerenciarPaciente();
        GerenciarMedico gerenciarMedico = new GerenciarMedico();
        GerenciarConsulta gerenciarConsulta = new GerenciarConsulta();
        int saida = 0, operacao;

        do {
            System.out.println("Dados de :");
            System.out.println("1- Paciente ");
            System.out.println("2- Medico ");
            System.out.println("3- Consulta ");
            System.out.println("0- Sair ");
            saida = sc.nextInt();

            switch (saida) {

                case 1: {
                    System.out.println("PACIENTES");
                    System.out.println("O que deseja fazer ?");
                    System.out.println("1- CADASTRAR");
                    System.out.println("2- CONSULTAR");
                    System.out.println("3- ATUALIZAR");
                    System.out.println("4 - DELETAR");
                    operacao = sc.nextInt();
                    switch (operacao) {
                        case 1:
                            gerenciarPaciente.cadastrar();
                            break;
                        case 2:
                            gerenciarPaciente.consultar();
                            break;
                        case 3:
                            gerenciarPaciente.atualizar();
                            break;
                        case 4:
                            gerenciarPaciente.deletar();
                            break;

                    }

                }

            }

        } while (saida != 0);
        
        
        
        
        
        
        
    }
}
