/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Davi
 */
public class Principal {

    public static void main(String[] args) {
        List<Cliente> listaClientes = new ArrayList<>();
        ControlaLista controle = new ControlaLista();

        Cliente c1 = new Cliente("Joaquim", 38, 1500);
        Cliente c2 = new Cliente("Lucas", 25, 2000);
        Cliente c3 = new Cliente("Fred", 30, 3000);

        listaClientes.add(c1);
        listaClientes.add(c2);
        listaClientes.add(0, c3);
        /*
        for (Cliente c : listaClientes) {
            //c ==> c[i]
            System.out.println("Nome: " + c.getNome());
        }
         */
        controle.imprimirLista(listaClientes);

        System.out.println("1º Elemento: " + listaClientes.get(0).getNome());
        listaClientes.clear();

        if (listaClientes.isEmpty()) {
            System.out.println("Lista vazia!");
        } else {
            controle.imprimirLista(listaClientes);
        }

        listaClientes.add(c1);
        listaClientes.add(c2);
        listaClientes.add(0, c3);
        
        controle.mediaRendaClientes(listaClientes);

    }

}
