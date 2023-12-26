//métodos
import java.sql.*;

import javax.swing.JTextField;
public class FilmesMetodos {
	public Filmes filme;
	public BD bd;
	private PreparedStatement st;
	private ResultSet rs;
	private String men, sql;
	public static final byte inclusao = 1;
	public static final byte alteracao = 2;
	public static final byte exclusao = 3;
	
	public FilmesMetodos(){
		bd = new BD();
		filme = new Filmes();
	}
	
	public boolean localizar(JTextField tfLocal){
		sql = "select * from estoque where cod = ?";
		try{
			st = bd.c.prepareStatement(sql);
			st.setString(1,tfLocal.getText());
			rs = st.executeQuery();
			rs.next();
			filme.setCod(rs.getString(1));
			filme.setNome(rs.getString(2));
			filme.setGenero(rs.getString(3));
			filme.setClassificacao(rs.getString(4));
			filme.setPreco(rs.getString(5));
			filme.setQtd(rs.getString(6));
			return true;
		}catch (SQLException erro){
			return false;
		}
	}
	public String atualizar(int operacao){
		men = "Operação realizada com sucesso";
		try{
			if (operacao == inclusao){
				sql = "insert into estoque values(?,?,?,?,?,?)";
				st = bd.c.prepareStatement(sql);
				st.setString(1, filme.getCod());
				st.setString(2, filme.getNome());
				st.setString(3, filme.getGenero());
				st.setString(4, filme.getClassificacao());
				st.setString(5, filme.getPreco());
				st.setString(6, filme.getQtd());
			}else if(operacao == alteracao){
				sql = "update estoque set nome = ?, genero = ?, classificacao = ?, preco = ?, qtd = ? where cod = ?";
				st = bd.c.prepareStatement(sql);
				st.setString(1, filme.getNome());
				st.setString(2, filme.getGenero());
				st.setString(3, filme.getClassificacao());
				st.setString(4, filme.getPreco());
				st.setString(5, filme.getQtd());
				st.setString(6, filme.getCod());
			} else if(operacao == exclusao){
				sql = "delete from estoque where cod = ?";
				st = bd.c.prepareStatement(sql);
				st.setString(1,filme.getCod());
			}
			if(st.executeUpdate()==0){
				men="Falha na operação";
			}
		}catch (SQLException erro){
			men = "Falha na operação"+erro.toString();
		}
		return men;
	}

}