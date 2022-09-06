/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03;

import ex02.*;


/**
 *
 * @author Davi
 */
public class Vetor {
    
    Produto[] p = new Produto[100];
    private int totalProdutos=0;

 
    public void adicionar(Produto p) {
        this.p[totalProdutos]=p;
        totalProdutos++;
    }    
    
    public void tamanhoVetor(){
        System.out.println("Tamanho do vetor: "+totalProdutos);
    }

    public void imprimir() {
        int i = 0;
        while (p[i] != null) {
            System.out.println("Nome: " + this.p[i].getNome() + " Pos: " + i);
            i++;
        }
    }
    
    public boolean existe(Produto prod){
        for(int i=0;i<totalProdutos;i++){
            if(prod.equals(this.p[i]))
                return true;            
        }
        return false;
    }
    
    public Produto buscarPorPosicao(int pos){
        if(validarPosicao(pos))
            return p[pos];
        else
            throw new IllegalArgumentException("Posição inválida!");        
    }
    
    public boolean validarPosicao(int pos){
        return pos >= 0 && pos <= totalProdutos-1;
    }
    
    public boolean validarPosicaoAdicionarPorPosicao(int pos){
        return pos >= 0 && pos <= totalProdutos;
    }
    
    public void adicionarPorPosicao(int pos,Produto prod){
        for(int i=totalProdutos-1;i>=pos;i--){
            p[i+1]=p[i];
        }
        p[pos]=prod;
        totalProdutos++;
    }
    
    public void removerPorPosicao(int pos){
        for(int i=pos;i<=totalProdutos-1;i++){
            p[i]=p[i+1];
        }
        totalProdutos--;
    }    
    

   
    
}
