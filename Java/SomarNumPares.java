/* Escreva um algoritmo que dado um conjunto de 20 elemtnos numéricos digitados em sequência,
informe a soma de todos os números pares. */

import java.util.Scanner;

public class SomarNumPares{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------SOMA DE NÚMEROS PARES---------");
        
        double num, soma = 0;
        
        for(int i=1; i<=20; i++){
            System.out.print("Digite o número " + i + ": ");
            num = sc.nextInt();
            
            if(num%2==0){
                soma += num;
            }
        }
        
        System.out.print("O total da soma dos números pares é: " + soma);
    }
}
