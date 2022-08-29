/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01;

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

    public static void main(String[] args) {
        Vetor vet = new Vetor();
        Aluno a1 = new Aluno("davi");
        Aluno a2 = new Aluno("daniel");
        Aluno a3 = new Aluno("lucas");
        Aluno a4 = new Aluno("joao");
        vet.adicionar(a1);
        vet.adicionar(a2);
        vet.adicionar(a3);
        vet.adicionar(a4);
        vet.imprimir();
        vet.tamanhoVetor();


    }    
    
}
