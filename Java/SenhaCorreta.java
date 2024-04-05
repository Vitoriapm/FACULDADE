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
