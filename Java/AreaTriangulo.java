import java.util.Scanner;

public class AreaTriangulo{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("---------ÁREA DO TRIÂNGULO---------");
      
        System.out.print("Digite a base do triângulo: ");
        int base = sc.nextInt();
      
        System.out.print("Digite a altura do triângulo: ");
        int altura = sc.nextInt();
        
        int area = (base*altura)/2;
        
        System.out.print("A área do triângulo é: " + area);
    }
}
