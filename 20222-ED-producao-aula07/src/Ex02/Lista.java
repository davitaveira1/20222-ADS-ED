/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02;

/**
 *
 * @author Davi
 */
public class Lista {
    
    No primeiro=null;
    No ultimo=null;
    
    void inserirNoFinal(No novoNo){
        
        if(primeiro==null){
            primeiro=novoNo;
        }else{
            ultimo.prox=novoNo;            
        }
        ultimo=novoNo;        
    }
    
    void inserirNoInicio(No novoNo){
        
        if(primeiro==null){
            primeiro=novoNo;
            ultimo=novoNo;
        }else{
            novoNo.prox=primeiro;
            primeiro=novoNo;
        }
    }
    
    void imprimir(){
        if(primeiro==null){
            System.out.println("Lista vazia!");
        }else{
            No aux=primeiro;
            while(aux!=null){
                System.out.println("No: "+aux.p.getNome());
                aux = aux.prox;
            }
        }
    }
    
}
