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
