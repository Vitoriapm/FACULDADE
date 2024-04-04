/* Receba dois número de entrada (a e b) e compare seus tamanhos, exibindo na saída: 
"a é MAIOR do que b", "a é MENOR do que b" ou "a é IGUAL a b". */

import java.util.Scanner;

public class MaiorMenorIgual{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------COMPARAÇÃO DE VALORES---------");

        
        System.out.print("Digite o primeiro valor: ");
        int a = sc.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        int b = sc.nextInt();
        
        int maior = a, menor = b;
        
        if(a > b){
            maior = a;
            menor = b;
            System.out.print(maior + " é MAIOR do que " + menor);
        }else if(a < b){
            menor = a;
            maior = b;
            System.out.print(menor + " é MENOR do que " + maior);
        }else{
            System.out.print(maior + " é IGUAL a " + menor);
        }
    }
}
