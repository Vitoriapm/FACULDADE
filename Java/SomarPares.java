// Escreva um algoritmo que calcule e imprima o somatório dos números pares existentes entre 100 e 500.

public class SomarPares{
    public static void main(String[]args){
        System.out.println("---------SOMA DE NÚMEROS PARES---------");
        
        int soma = 0;
        
        for(int i=100; i<=500; i+=2){
            soma += i;
        }
        
        System.out.print("A soma dos números pares entre 100 e 500 é: " + soma);
    }
}
