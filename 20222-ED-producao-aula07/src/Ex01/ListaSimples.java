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
    
    public void inserirNoFinal(No novoNo){
        
        if(primeiro==null){
            primeiro=novoNo;
        }else{
            ultimo.prox=novoNo;            
        }
        ultimo=novoNo;        
    }
    
    public void inserirNoInicio(No novoNo){
        
        if(primeiro==null){
            primeiro=novoNo;
            ultimo=novoNo;
        }else{
            novoNo.prox=primeiro;
            primeiro=novoNo;
        }
    }
    
    public void imprimir(){
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
    
    public int contarNos(){
             int cont=0;       
        if(primeiro==null){
            System.out.println("Lista vazia!");
        }else{
            No aux=primeiro;

            while(aux!=null){
                cont++;
                aux=aux.prox;
            }           
        }        
        return cont;        
    }
    
    public void removerNoFinal(){
        
        if(primeiro==null){
            System.out.println("Lista vazia!");
        }else{
            if(contarNos()==1){
                primeiro=null;
                ultimo=null;
            }else{
                //EXISTE MAIS DE UM ELEMENTO NA LISTA
                No aux=primeiro;
                while(aux.prox.prox!=null){
                    aux=aux.prox;
                }
                aux.prox=null;
                ultimo=aux;
            }
        }
        
    }
    
    
    
    
    
    
}
