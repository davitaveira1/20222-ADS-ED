/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

/**
 *
 * @author Davi
 */
public class Principal {
    
    public static void main(String[] args) {
       ListaSimples lista = new ListaSimples();
       No no1 = new No(1);
       No no2 = new No(2);
       
       lista.inserirNoFinal(no1);
       lista.inserirNoFinal(no2);
       lista.imprimir();
    }
    
}
