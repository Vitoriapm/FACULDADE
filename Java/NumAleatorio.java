/* Crie um jogo onde o computador gera um número aleatório entre 1 e 100, e o usuário tenta advinhar o número.
Utilize um laço do-while para permitir que o usuário continue tentando até que ele advinhe corretamente o número gerado.
Se errar, informe ao usuário se o número digitado é maior ou menor do valor a ser advinhado.
OBS: Para utilizar a classe RANDOM no Java, utilize: import java.util.Random; Random Rand = new Random();
int numeroAleat = rand.nextInt(101)+1; */

import java.util.Scanner;
import java.util.Random;

public class NumAleatorio{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("---------NÚMERO ALEATÓRIO---------");
        
        int numeroAleat = rand.nextInt(101) + 1, num = 0;
        
        do{
            System.out.print("Advinhe o número: ");
            num = sc.nextInt();
            if(num<numeroAleat){
                System.out.println(num + " é MENOR do que o número aleatório.");
            }else if(num>numeroAleat){
                System.out.println(num + " é MAIOR do que o número aleatório.");
            }
        }while(num!=numeroAleat);
        
        System.out.print("Parabéns! O número aleatório é: " + numeroAleat);
    }
}
