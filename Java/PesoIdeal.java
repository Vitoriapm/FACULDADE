/* Escreva um programa que receba duas entradas do usuário: o sexo(M ou F) e a altura (h) em metros. 
Com essas informações, o programa deve calcular o peso ideal desse indivíduo pelas fórmulas:
Para homens: pIdeal = (72.7*h) - 58
Para mulheres: pIdeal = (62.1*h) - 44.7 */

import java.util.Scanner;

public class PesoIdeal{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------CÁLCULO DO PESO IDEAL---------");
        
        System.out.print("Qual seu gênero? (M ou F): ");
        String sexo = sc.nextLine();
        
        System.out.print("Digite sua altura (em metros): ");
        double h = sc.nextDouble();
        
        if(sexo.equalsIgnoreCase("M")){
            double pIdeal = (72.7*h) - 58;
            System.out.print("Seu peso ideal é: " + String.format("%.2f",pIdeal) + "kg");
        }else if(sexo.equalsIgnoreCase("F")){
            double pIdeal = (62.1*h) - 44.7;
            System.out.print("Seu peso ideal é: " + String.format("%.2f",pIdeal) + "kg");
        }else{
            System.out.print("Digite o gênero novamente (M ou F)!");
        }
    }
}
