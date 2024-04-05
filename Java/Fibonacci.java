/* Receba como entrada, um número inteiro n e calcule a soma dos n primeiros números
da sequência de Fibonacci.
A sequência de Fibonacci é: (1,2,3,5...) */

import java.util.Scanner;

public class Fibonacci{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------SEQUÊNCIA DE FIBONACCI---------");
        
        System.out.print("Quantos números você deseja saber da sequência? ");
        int n = sc.nextInt();
        
        int penultimo = 1, ultimo = 1, soma = 0;
        
        System.out.print("Fibonacci: ");
        for(int i=1; i<=n; i++){
            if(i<n){
                System.out.print(penultimo + ",");
            }else{
                System.out.print(penultimo);
            }
            soma = penultimo + ultimo;
            penultimo = ultimo;
            ultimo = soma;
        }
    }
}
