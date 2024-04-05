/* Escreva um programa que solicite ao usuário que insira uma senha.
Utilize o laço while para continuar solicitando a senha até que o usuário insira a senha correta.
Após inserir a senha correta, exiba uma mensagem de boas-vindas. */

import java.util.Scanner;

public class SenhaCorreta{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------SENHA CORRETA---------");
        
        String senha = "senha";
        
        while(true){
            System.out.print("Digite sua senha: ");
            String usuario = sc.nextLine();
            
            if(usuario.equals(senha)){
                break;
            }
        }
        
        System.out.print("Seja bem-vindo!");
    }
}
