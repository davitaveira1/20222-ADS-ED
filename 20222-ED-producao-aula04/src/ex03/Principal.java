/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03;

import java.util.Scanner;

/**
 *
 * @author Davi
 */
public class Principal {

    public static void main(String[] args) {

        int opcao;
        String nome;
        int pos;
        Produto p;
        Scanner entrada = new Scanner(System.in);
        Vetor vet = new Vetor();

        do {
            System.out.print("Informe a opção: ");
            opcao = entrada.nextInt();
            switch (opcao) {            
                case 1:
                    System.out.print("Informe o nome do produto: ");
                    nome = entrada.next();
                    p = new Produto(nome);
                    vet.adicionar(p);                    
                    break;
                    
                case 2:
                    System.out.println("Informe o nome do produto e a posição: ");
                    nome = entrada.next();
                    pos = entrada.nextInt();
                    p = new Produto(nome);
                    vet.adicionarPorPosicao(pos, p);
                    break;
                    
                case 5:
                    vet.tamanhoVetor();
                    
                case 7:
                    vet.imprimir();
                    break;
                    
                default:
                    System.out.println("Opção inválida!!!");
            }

        } while (opcao != 0);

    }

}
