/* Desenvolva um programa que utilize um laço while para exibir a tabuada de um número escolhido pelo usuário.
O programa deve permitir que o usuário escolha qual número deseja multiplicar até que ele decida encerrar o programa.*/

import java.util.Scanner;

public class Tabuada{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    
        System.out.println("---------TABUADA---------");
        
        while(true){
            int tabuada = 0, total = 1;
            
            System.out.print("Escolha um número para saber sua tabuada: ");
            int num = sc.nextInt();
            
            while(tabuada<=10){
                total = tabuada * num;
                System.out.println(tabuada + "x" + num + "=" + total);
                tabuada++;
            }
            
            sc.nextLine();
            System.out.print("Deseja continuar? (S ou N) ");
            String usuario = sc.nextLine();
            
            if(usuario.equalsIgnoreCase("N")){
                break;
            }
        }
    }
}
