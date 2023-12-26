import java.sql.*;
//2
public class Consulta {
	public static void main(String args[]) {
		BD bd = new BD(); //Cria objeto da classe banco de dados
		if (bd.getConnection()) {
			try {
				String sql = "Select Ranking,Filme from bilheterias where Ranking>? and Ranking<?" + "order by Ranking";//variável sql serve para armazenar o código de sql para buscar no banco de dados;
				PreparedStatement s = bd.c.prepareStatement(sql);//preparestatemet é uma classe responsável por ligar o programa em java ao banco de dados (tunel)
				s.setString(1, "00"); //é o valor que irá substituir as interrogações do código sql;
				s.setString(2, "05");
				ResultSet rs = s.executeQuery();// resultset é a classe que armazena a busca feita pelo banco de dados;
				System.out.println("Ranking  Título");
				System.out.println("------  ----------------------------");
				while (rs.next()) { //método next organiza a busca armazenada em linhas , igual o banco de dados e mostra uma por uma dentro do while
					String codigo = rs.getString("Ranking");
					String titulo = rs.getString("Filme");
					System.out.println(codigo + "     " + titulo);
				}
				rs.close();//finaliza a conexão e as váriaveis;
				s.close();
				bd.close();
			} catch (SQLException erro) {
			}
		} else {
			System.out.println("Erro ao conectar!");
		}
	}
}