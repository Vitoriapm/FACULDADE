import java.util.Scanner;

public class VolumeEsfera{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("---------CÁLCULO DO VOLUME DA ESFERA---------");
        System.out.print("Digite o valor do raio da esfera: ");
        double R = sc.nextDouble();
        double pi = 3.14159;
        double volume = (4*(pi*Math.pow(R,3)))/3;
        System.out.print("O volume da esfera é: " + volume);
    }
}
