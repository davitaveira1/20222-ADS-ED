
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Davi
 */
public class Ex01 {
    
    public static void main(String[] args) {
        int i;
        double soma=0,media=0;
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        
        double[] vet = new double[n];
        for(i=0;i<n;i++){
            vet[i]=entrada.nextDouble();
        }
        
        for(i=0;i<n;i++){
           soma += vet[i]; 
        }
        
        media=soma/n;
        
        System.out.printf("Média: %.2f\n",media);
        
    }
    
}
