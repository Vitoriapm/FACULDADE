/* Crie um programa que solicite ao usuário que insira números inteiros positivos.
Utilize um laço do-while para somar os números pares inseridos, até que o usuário insira um número negativo.
No final, exiba a soma dos números pares inseridos. */

import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------SOMA DE NÚMEROS PARES POSITIVOS---------");
        
        int num, soma = 0;
        
        do{
            System.out.println("Digite um número positivo: ");
            num = sc.nextInt();
            
            if(num%2==0){
                soma+=num;
            }
        }while(num>0);
        
        System.out.print("A soma total dos números pares inseridos é de: " + soma);
    }
}
