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
		sql = "select * from bilheterias where Ranking = ?";
		try{
			st = bd.c.prepareStatement(sql);
			st.setString(1,tfLocal.getText());
			rs = st.executeQuery();
			rs.next();
			filme.setCodigo(rs.getString(1));
			filme.setTitulo(rs.getString(2));
			filme.setGenero(rs.getString(3));
			filme.setAno(rs.getString(4));
			return true;
		}catch (SQLException erro){
			return false;
		}
	}
	public String atualizar(int operacao){
		men = "Operação realizada com sucesso";
		try{
			if (operacao == inclusao){
				sql = "insert into bilheterias values(?,?,?,?)";
				st = bd.c.prepareStatement(sql);
				st.setString(1,filme.getCodigo());
				st.setString(2, filme.getTitulo());
				st.setString(3, filme.getGenero());
				st.setString(4,filme.getAno());
			}else if(operacao == alteracao){
				sql = "update bilheterias set Filme = ?,Genero = ?, Ano= ? where Ranking = ?";
				st = bd.c.prepareStatement(sql);
				st.setString(1,filme.getTitulo());
				st.setString(2,filme.getGenero());
				st.setString(3,filme.getAno());
				st.setString(4,filme.getCodigo());
			} else if(operacao == exclusao){
				sql = "delete from bilheterias where Ranking = ?";
				st = bd.c.prepareStatement(sql);
				st.setString(1,filme.getCodigo());
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