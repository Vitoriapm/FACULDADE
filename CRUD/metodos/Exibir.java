package metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Editar {

	public static void editar() throws SQLException{
		Scanner sc = new Scanner(System.in);
	
		//url de conexao
		String url = "jdbc:mysql://localhost:3306/crud";
		String user = "root";
		String password = "dbadmin";
		
		Connection conexao = null;
		conexao = DriverManager.getConnection(url, user, password);
		
		//código mysql para update
		String sql = "UPDATE empresa "
				+ "SET cnpj = ?, nome = ?, endereco = ?, email = ?"
				+ "WHERE cnpj = ?";
	
		PreparedStatement st = conexao.prepareStatement(sql);
		
		//atualizar os valores
		System.out.println("Qual o CNPJ da empresa que você deseja atualizar? ");
		String escolhaCnpj = sc.nextLine();
		
		System.out.println("CNPJ: ");
		String cnpj = sc.nextLine();
		
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Endereço: ");
		String endereco = sc.nextLine();
		
		System.out.println("E-mail: ");
		String email = sc.nextLine();
		
		
		//adicionar os valores no banco
		st.setString(1, cnpj);
		st.setString(2, nome);
		st.setString(3, endereco);
		st.setString(4, email);
		st.setString(5, escolhaCnpj);
		st.executeUpdate();
		
		System.out.println("Os dados foram atualizados com sucesso!");
		
		conexao.close();
		sc.close();
	}
	
	
}
