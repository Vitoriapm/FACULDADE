/* Escreva um programa que receba, somo entrada, dois números inteiros (a e b).
Na saída, esse programa deve exibir o valor da soma de todos os números inteiros entre a e b,
incluindo os extremos. 
Exemplo: a=1 e b=5; saída: 1+2+3+4+5=15. */

import java.util.Scanner;

public class SomarInteiros{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------SOMA DE NÚMEROS INTEIROS---------");
        
        System.out.print("Digite um número inteiro: ");
        int a = sc.nextInt();
        
        System.out.print("Digite outro número inteiro: ");
        int b = sc.nextInt();
        
        int maior = a, menor = b, soma = 0;
        
        if(a>b){
            maior = a;
            menor = b;
        }else if(a<b){
            menor = a;
            maior = b;
        }
        
        while(menor<=maior){
            if(menor<maior){
                System.out.print(menor + "+");
            }
            soma += menor;
            menor++;
        }
        
        System.out.print(maior + "=" + soma);
    }
}
