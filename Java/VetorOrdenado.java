/* Escreva um programa que solicite ao usuário informar a quantidade de números inteiros que deseja inserir.
Em seguida, permita que o usuário insira os números inteiros em ordem aleatória.
Por fim, ordene o vetor de números inteiros inseridos pelo usuário e exiba o vetor completamente ordenado. */

import java.util.Scanner;

public class VetorOrdenado{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------ORDENAR UM VETOR---------");
        
        System.out.print("Digite quantidade de números do vetor: ");
        int qtd = sc.nextInt();
        
        int vetor[] = new int [qtd];
        
        for(int i=0; i<qtd; i++){
            System.out.print("Digite o valor " + (i+1) + " do vetor: ");
            vetor[i] = sc.nextInt();
        }
        
        System.out.println("Vetor na ordem do usuário: ");
        for(int i=0; i<qtd; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println(" ");
        
        for(int i=0; i<qtd; i++){
            for(int j=i+1; j<qtd; j++){
                if(vetor[i] > vetor[j]){
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        
        System.out.println("Vetor Ordenado: ");
        for(int i=0; i<qtd; i++){
            System.out.print(vetor[i] + " ");
        }
    }
}
