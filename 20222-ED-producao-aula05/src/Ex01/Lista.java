/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Davi
 */
public class Lista {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        list.add("daniel");
        list.add("lucas");
        list.add("ricardo");
        list.add(0, "jose");
        list.add(4, "jonas");
        list.add("davi");

        for (String x : list) {
            System.out.println("Nome: " + x);
        }
        System.out.println("===========");

        System.out.println("Tamanho da lista: " + list.size());

        if (list.remove("davi")) {
            System.out.println("Elemento removido!");
        } else {
            System.out.println("Elemento não encontrado!");
        }
        
        list.remove(0);

        for (String x : list) {
            System.out.println("Nome: " + x + " pos: "+list.indexOf(x));
        }
        System.out.println("===========");  
        
        System.out.println("Elemento na pos 0: "+list.get(0));
        
        System.out.println("Alterar elemento 1 ");
        list.set(1,"Afonso");
        for (String x : list) {
            System.out.println("Nome: " + x + " pos: "+list.indexOf(x));
        }       
        
        list.clear();
        System.out.println("===Lista vazia===");
        for (String x : list) {
            System.out.println("Nome: " + x + " pos: "+list.indexOf(x));
        }         
    }

}
