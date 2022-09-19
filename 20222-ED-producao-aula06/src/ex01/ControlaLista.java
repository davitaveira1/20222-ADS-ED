/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01;

import java.util.List;

/**
 *
 * @author Davi
 */
public class ControlaLista {
    
    public void imprimirLista(List<Cliente> lista){
        for(Cliente c : lista){
            System.out.println("Nome: "+c.getNome()+
                               " Idade: "+c.getIdade()+ 
                               " Renda: "+c.getRenda());
        }
        System.out.println("=====================");
        
    }
    
    public void mediaRendaClientes(List<Cliente> lista){
        double soma=0,rendaMedia=0;
        for(int i=0;i<lista.size();i++){
            soma = soma + lista.get(i).getRenda();
        }
        rendaMedia = soma/lista.size();
        System.out.println("Renda média dos clientes: "+rendaMedia);
        
    }
    
}
