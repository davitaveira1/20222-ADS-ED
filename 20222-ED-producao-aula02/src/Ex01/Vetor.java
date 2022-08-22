/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

/**
 *
 * @author 2201338
 */
public class Vetor {
    
    Aluno[] aluno = new Aluno[100];
    
public void adicionaV1(Aluno aluno){
        //implementar
    }
    
    public void adicionaV2(Aluno aluno){
        for(int i=0;i<this.aluno.length;i++){
            if(this.aluno[i]==null){
                this.aluno[i]=aluno;
                break;
            }
            
        }
    }
    

    
    public void imprimirV1(){
        for(int i=0;i < aluno.length ; i++){
            if(aluno[i]!=null)
                System.out.println("Nome: "+aluno[i].getNome() +" pos: "+i);
        }
    }
    
    public void imprimirV2(){
        int i=0;
        while(aluno[i]!=null){
            System.out.println("Nome: "+this.aluno[i].getNome()+ " Pos: "+i);
            i++;
        }        
    }    

   public static void main(String[] args) {
        Vetor vet = new Vetor();
        Aluno a1 = new Aluno("davi");
        Aluno a2 = new Aluno("daniel");
        Aluno a3 = new Aluno("lucas");
        Aluno a4 = new Aluno("joao");
        vet.adicionaV2(a1);
        vet.adicionaV2(a2);
        vet.adicionaV2(a3);
        vet.adicionaV2(a4);
        vet.imprimirV2();
        /*
        System.out.println("Nome: "+vet.aluno[2].getNome());
        System.out.println("Nome: "+vet.aluno[4].getNome());
        System.out.println("Nome: "+vet.aluno[5].getNome());
        */
        //vet.imprimirV1();
        
    }
    

    
}
