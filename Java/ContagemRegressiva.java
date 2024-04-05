/* Escreva um programa que utilize um laço while para imprimir uma contagem regressiva de 10 a 1,
e então exiba "Fogo!". */

public class ContagemRegressiva{
    public static void main(String[]args){
        System.out.println("---------CONTAGEM REGRESSIVA---------");
        
        int contagem = 10;
        
        while(contagem>=1){
            System.out.println(contagem);
            contagem--;
        }
        
        System.out.print("Fogo!");
    }
}
