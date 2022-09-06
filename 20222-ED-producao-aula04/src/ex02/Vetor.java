/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02;


/**
 *
 * @author Davi
 */
public class Vetor {
    
    Aluno[] aluno = new Aluno[100];
    private int totalAlunos=0;

 
    public void adicionar(Aluno aluno) {
        this.aluno[totalAlunos]=aluno;
        totalAlunos++;
    }    
    
    public void tamanhoVetor(){
        System.out.println("Tamanho do vetor: "+totalAlunos);
    }

    public void imprimir() {
        int i = 0;
        while (aluno[i] != null) {
            System.out.println("Nome: " + this.aluno[i].getNome() + " Pos: " + i);
            i++;
        }
    }
    
    public boolean existe(Aluno a){
        for(int i=0;i<totalAlunos;i++){
            if(a.equals(aluno[i]))
                return true;            
        }
        return false;
    }
    
    public Aluno buscarPorPosicao(int pos){
        if(validarPosicao(pos))
            return aluno[pos];
        else
            throw new IllegalArgumentException("Posição inválida!");        
    }
    
    public boolean validarPosicao(int pos){
        return pos >= 0 && pos <= totalAlunos-1;
    }
    
    public boolean validarPosicaoAdicionarPorPosicao(int pos){
        return pos >= 0 && pos <= totalAlunos;
    }
    
    public void adicionarPorPosicao(int pos,Aluno a){
        for(int i=totalAlunos-1;i>=pos;i--){
            aluno[i+1]=aluno[i];
        }
        aluno[pos]=a;
        totalAlunos++;
    }
    
    public void removerPorPosicao(int pos){
        for(int i=pos;i<=totalAlunos-1;i++){
            aluno[i]=aluno[i+1];
        }
        totalAlunos--;
    }    
    

   
    
}
