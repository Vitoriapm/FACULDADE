// Escreva um programa que calcule o preço final de um item de mercado que tenha sofrido um aumento de 25%. 

import java.util.Scanner;

public class AumentoPreco{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------AUMENTO DO PREÇO---------");
        
        System.out.print("Digite o valor de um produto: ");
        double produto = sc.nextInt();
        
        double precoFinal = ((produto/100) * 25) + produto;
        
        System.out.print("O produto sofreu um aumento de 25%, logo seu valor é: R$" + precoFinal);
    }
}
