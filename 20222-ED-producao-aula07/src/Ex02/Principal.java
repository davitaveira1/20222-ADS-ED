/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02;

/**
 *
 * @author Davi
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Lista l = new Lista();
        Produto p = new Produto("TV","Eletrodoméstico",1500);
        No no1 = new No(p);
        
        l.inserirNoFinal(no1);
        l.imprimir();
        
    }
    
}
