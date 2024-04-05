/* Faça um programa, utilizando while, que mostre na tela de 0 até n, 
em que n é o limite inserido pelo usuário. */

import java.util.Scanner;

public class LimiteNum{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------LIMITE DE NÚMEROS---------");
        
        System.out.print("Quantos números serão mostrados? ");
        int n = sc.nextInt();
        
        int mostrarNum = 0;
        
        while(mostrarNum<n){
            System.out.print(mostrarNum + ",");
            mostrarNum++;
        }
        System.out.print(n);
    }
}
