/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02;

import java.util.Scanner;

/**
 *
 * @author Davi
 */
public class principal {

    public static void main(String[] args) {

        int opcao;
        Scanner entrada = new Scanner(System.in);

        Vetor vet = new Vetor();
        Aluno a1 = new Aluno("davi");
        Aluno a2 = new Aluno("daniel");
        Aluno a3 = new Aluno("lucas");
        Aluno a4 = new Aluno("joao");
        //System.out.println("////////////////////////////////////////");
        do {
            System.out.print("Menu de opções: \n\n");

            System.out.print("1 - Adicionar \n");
            System.out.print("2 - Adicionar por posição \n");
            System.out.print("3 - Buscar por posição \n");
            System.out.print("4 - Tamanho do vetor\n");
            System.out.print("5 - Verificar se existe \n");
            System.out.print("6 - Imprimir \n\n");
            System.out.print("0 - Sair \n\n");

            System.out.print("Informe a opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    break;
                case 2:              
                    break;
                case 3:                   
                    break;
                case 4:                   
                    break;
                case 5:                   
                    break;
                case 6:                    
                    break;
                default:                     
                    break;
            }
        } while (opcao != 0);

        //System.out.println("////////////////////////////////////////");
    }

}
