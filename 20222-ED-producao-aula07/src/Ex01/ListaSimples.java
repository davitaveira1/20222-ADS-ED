/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

/**
 *
 * @author Davi
 */
public class ListaSimples {
    //índices da lista
    No primeiro=null;
    No ultimo=null;
    
    void inserirNoFinal(No valorNo){
        
        if(primeiro==null){
            primeiro=valorNo;
        }else{
            ultimo.prox=valorNo;            
        }
        ultimo=valorNo;        
    }
    
    void imprimir(){
        if(primeiro==null){
            System.out.println("Lista vazia!");
        }else{
            No aux=primeiro;
            while(aux!=null){
                System.out.println("No: "+aux.valor);
                aux = aux.prox;
            }
        }
    }
    
    
    
    
    
}
