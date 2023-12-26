//interface gráfica 
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;



public class CadastroFilmes extends JFrame{
	private JLabel label1, label2, label3, label4;
	private JButton btGravar, btExcluir, btAlterar,btNovo,btLocalizar,btCancelar,btSair;
	private JTextField tfCodigo, tfTitulo, tfGenero, tfAno;
	private BD bd;
	private PreparedStatement st;
	private ResultSet rs;
	private FilmesMetodos filmes;
	private String sql;
	
	public static void main(String args[]) {
		JFrame frame = new CadastroFilmes();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public CadastroFilmes(){
		inicializarComponentes();
		definirEventos();
	}
	
	public void inicializarComponentes(){
		setLayout(new FlowLayout(FlowLayout.LEFT));
		label1 = new JLabel("Código");
		label2 = new JLabel("Titulo");
		label3 = new JLabel("Gênero");
		label4 = new JLabel("Ano");
		tfCodigo = new JTextField(10);
		tfTitulo = new JTextField(35);
		tfGenero = new JTextField(15);
		tfAno = new JTextField(10);
		btGravar = new JButton("Gravar");
		btExcluir = new JButton("Excluir");
		btAlterar = new JButton("Alterar");
		btNovo = new JButton("Novo");
		btLocalizar = new JButton("Localizar");
		btCancelar= new JButton("Cancelar");
		btSair = new JButton("Sair");
		add(label1);
		add(tfCodigo);
		add(label2);
		add(tfTitulo);
		add(label3);
		add(tfGenero);
		add(label4);
		add(tfAno);
		add(btAlterar);
		add(btExcluir);
		add(btGravar);
		add(btLocalizar);
		add(btNovo);
		add(btSair);
		setTitle("Consulta de filmes");
		setBounds(200,300,620,150 );
		setResizable(false);
		setBotoes(true,true,false,false,false,false,false);
		filmes = new FilmesMetodos();
		if(!filmes.bd.getConnection()){
			JOptionPane.showMessageDialog(null,"Falha na conexão!");
			System.exit(0);
		}
	}
	public void definirEventos(){
		btSair.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					
				filmes.bd.close();
				System.exit(0);
			}
		});
		btNovo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					
				limparCampos();
				setBotoes(false,false,true,true,true,true,true);
			}
		});
		
		btCancelar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			    limparCampos();
				
			}
		});
		
		btGravar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(tfCodigo.getText().equals(" ")){
					JOptionPane.showMessageDialog(null,"O código não pode ser vazio!");
					tfCodigo.requestFocus();
					return;
				}
				if(tfTitulo.getText().equals(" ")){
					JOptionPane.showMessageDialog(null,"O título não pode ser vazio!");
					tfTitulo.requestFocus();
					return;	
			}
				if(tfGenero.getText().equals(" ")){
					JOptionPane.showMessageDialog(null,"O gênero não pode ser vazio!");
					tfGenero.requestFocus();
					return;
				}
				if(tfAno.getText().equals(" ")){
					JOptionPane.showMessageDialog(null,"O ano não pode ser vazio!");
					tfAno.requestFocus();
					return;
				}
				filmes.filme.setCodigo(tfCodigo.getText());
				filmes.filme.setTitulo(tfTitulo.getText());
				filmes.filme.setGenero(tfGenero.getText());
				filmes.filme.setAno(tfAno.getText());
				filmes.atualizar(1);
				limparCampos();
			}	
		});
		
			btAlterar.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					filmes.filme.setCodigo(tfCodigo.getText());
					filmes.filme.setTitulo(tfTitulo.getText());
					filmes.filme.setGenero(tfGenero.getText());
					filmes.filme.setAno(tfAno.getText());
					filmes.atualizar(2);
					limparCampos();
				}
			});
			btExcluir.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					filmes.filme.setCodigo(tfCodigo.getText());					
					int n = JOptionPane.showConfirmDialog(null,"sua mae","Excluir o filme?", JOptionPane.YES_OPTION);
					if (n == JOptionPane.YES_OPTION){
						filmes.atualizar(3);
						limparCampos();
					}
					setBotoes(true,true,false,false,false,false,false);
				}
			});	
			btLocalizar.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					
					atualizarCampos();
				}
			});
	
}
	public void limparCampos(){
		tfCodigo.setText("");
		tfTitulo.setText("");
		tfGenero.setText("");
		tfAno.setText("");
		tfCodigo.requestFocus();
		setBotoes(true,true,false,false,false,false,false);
	}
	public void atualizarCampos(){
		filmes.filme.setCodigo(tfCodigo.getText());
		if(filmes.localizar(tfCodigo)){
			tfCodigo.setText(filmes.filme.getCodigo());
			tfTitulo.setText(filmes.filme.getTitulo());
			tfGenero.setText(filmes.filme.getGenero());
			tfAno.setText(filmes.filme.getAno());
			setBotoes(true,true,false,false,false,false,false);

		}else{
			JOptionPane.showMessageDialog(null, "Filme não encontrado");
			limparCampos();
		}
	}
	public void setBotoes(boolean bNovo, boolean bLocalizar, boolean bGravar, boolean bAlterar, boolean bExcluir, boolean bCancelar, boolean bLocal){
		btNovo.setEnabled(bNovo);
		btLocalizar.setEnabled(bLocalizar);
		btGravar.setEnabled(bGravar);
		btAlterar.setEnabled(bAlterar);
		btExcluir.setEnabled(bExcluir);
		btCancelar.setEnabled(bCancelar);
		btLocalizar.setEnabled(bLocal);
	}
}