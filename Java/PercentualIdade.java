/* Escreva um algoritmo que dado um conjunto com a idade de 50 pessoas digitados em sequência,
informe o percentual em cada faixa etária: de 0 a 15 anos, de 16 a 30 anos, de 31 a 45 anos,
de 46 a 60 anos e mais que 60 anos. */

import java.util.Scanner;

public class PercentualIdade{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------PERCENTUAL DE FAIXA ETÁRIA---------");
        
        int idade = 0, idade15 = 0, idade30 = 0, idade45 = 0, idade60 = 0, idadeMaior = 0;
        
        for(int i=1; i<=50; i++){
            System.out.print("Digite a idade da pessoa " + i + ": ");
            idade = sc.nextInt();
            
            if(idade>=0 && idade<=15){
                idade15++;
            }else if(idade<=30){
                idade30++;
            }else if(idade<=45){
                idade45++;
            }else if(idade<=60){
                idade60++;
            }else if(idade>60){
                idadeMaior++;
            }else{
                System.out.print("Idade não existente!");
            }
        }
        
        System.out.println((idade15*100)/50 + "% de pessoas de 0 a 15 anos.");
        System.out.println((idade30*100)/50 + "% de pessoas de 16 a 30 anos.");
        System.out.println((idade45*100)/50 + "% de pessoas de 31 a 45 anos.");
        System.out.println((idade60*100)/50 + "% de pessoas de 46 a 60 anos.");
        System.out.print((idadeMaior*100)/50 + "% de pessoas maiores de 60 anos.");
    }
}
