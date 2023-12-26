//interface gráfica 
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;



public class CadastroFilmes extends JFrame{
	private JLabel label1, label2, label3, label4, label5, label6, lbfundo;
	private ImageIcon fundo = new ImageIcon("C:\\Users\\root\\Pictures\\aaaa.jpg");
	private JButton btGravar, btExcluir, btAlterar,btNovo,btLocalizar,btCancelar,btSair;
	private JTextField tfCod, tfNome, tfGenero, tfClassificacao, tfPreco, tfQtd;
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
		setLayout(null);

		label1 = new JLabel("Código");
		label1.setBounds(20,20,50,20);
		label2 = new JLabel("Nome");
		label2.setBounds(20,50,50,20);
		label3 = new JLabel("Gênero");
		label3.setBounds(20,80,50,20);
		label4 = new JLabel("Classificação");
		label4.setBounds(20,110,80,20);
		label5 = new JLabel("Preço");
		label5.setBounds(20,140,50,20);
		label6 = new JLabel("Quantidade");
		label6.setBounds(20,170,70,20);
		
		tfCod = new JTextField(10);
		tfCod.setBounds(100,20,200,20);
		tfNome = new JTextField(35);
		tfNome.setBounds(100,50,200,20);
		tfGenero = new JTextField(15);
		tfGenero.setBounds(100,80,200,20);
		tfClassificacao = new JTextField(10);
		tfClassificacao.setBounds(100,110,200,20);
		tfPreco = new JTextField(10);
		tfPreco.setBounds(100,140,200,20);
		tfQtd = new JTextField(10);
		tfQtd.setBounds(100,170,200,20);
		
		btGravar = new JButton("Gravar");
		btGravar.setBounds(20,200,100,20);
		btExcluir = new JButton("Excluir");
		btExcluir.setBounds(130,200,100,20);
		btAlterar = new JButton("Alterar");
		btAlterar.setBounds(240,200,100,20);
		btLocalizar = new JButton("Localizar");
		btLocalizar.setBounds(350,200,100,20);
		
		btNovo = new JButton("Novo");
		btNovo.setBounds(130,230,100,20);
		btCancelar= new JButton("Cancelar");
		btCancelar.setBounds(300,230,100,20);
		btSair = new JButton("Sair");
		btSair.setBounds(240,230,100,20);
		
		lbfundo = new JLabel(fundo);
		lbfundo.setBounds(0,0,600,500);
		
		add(label1);
		add(tfCod);
		add(label2);
		add(tfNome);
		add(label3);
		add(tfGenero);
		add(label4);
		add(tfClassificacao);
		add(label5);
		add(tfPreco);
		add(label6);
		add(tfQtd);
		add(btAlterar);
		add(btExcluir);
		add(btGravar);
		add(btLocalizar);
		add(btNovo);
		add(btSair);
		add(lbfundo);
		setTitle("Consulta de jogos");
		setSize(600,500);
		setLocationRelativeTo(null);
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
				if(tfCod.getText().equals(" ")){
					JOptionPane.showMessageDialog(null,"O código não pode ser vazio!");
					tfCod.requestFocus();
					return;
				}
				if(tfNome.getText().equals(" ")){
					JOptionPane.showMessageDialog(null,"O título não pode ser vazio!");
					tfNome.requestFocus();
					return;	
			}
				if(tfGenero.getText().equals(" ")){
					JOptionPane.showMessageDialog(null,"O gênero não pode ser vazio!");
					tfGenero.requestFocus();
					return;
				}
				if(tfClassificacao.getText().equals(" ")){
					JOptionPane.showMessageDialog(null,"O ano não pode ser vazio!");
					tfClassificacao.requestFocus();
					return;
				}
				if(tfPreco.getText().equals(" ")){
					JOptionPane.showMessageDialog(null,"O ano não pode ser vazio!");
					tfPreco.requestFocus();
					return;
				}
				if(tfQtd.getText().equals(" ")){
					JOptionPane.showMessageDialog(null,"O ano não pode ser vazio!");
					tfQtd.requestFocus();
					return;
				}
				filmes.filme.setCod(tfCod.getText());
				filmes.filme.setNome(tfNome.getText());
				filmes.filme.setGenero(tfGenero.getText());
				filmes.filme.setClassificacao(tfClassificacao.getText());
				filmes.filme.setPreco(tfPreco.getText());
				filmes.filme.setQtd(tfQtd.getText());
				filmes.atualizar(1);
				limparCampos();
				JOptionPane.showMessageDialog(null, "Registro gravado com sucesso!");
			}	
		});
		
			btAlterar.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					filmes.filme.setCod(tfCod.getText());
					filmes.filme.setNome(tfNome.getText());
					filmes.filme.setGenero(tfGenero.getText());
					filmes.filme.setClassificacao(tfClassificacao.getText());
					filmes.filme.setPreco(tfPreco.getText());
					filmes.filme.setQtd(tfQtd.getText());
					filmes.atualizar(2);
					limparCampos();
					JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!");
				}
			});
			btExcluir.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(tfCod.getText().equals(" ")){
						JOptionPane.showMessageDialog(null,"O código não pode ser vazio!");
						tfCod.requestFocus();
						return;
					}
					filmes.filme.setCod(tfCod.getText());					
					int n = JOptionPane.showConfirmDialog(null,"Excluir o filme?","?", JOptionPane.YES_OPTION);
					if (n == JOptionPane.YES_OPTION){
						filmes.atualizar(3);
						limparCampos();
					}
					JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!");
					setBotoes(true,true,false,false,false,false,false);
				}
			});	
			btLocalizar.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					atualizarCampos();
				}
			});
	
}
	public void limparCampos() {
		tfCod.setText("");
		tfNome.setText("");
		tfGenero.setText("");
		tfClassificacao.setText("");
		tfPreco.setText("");
		tfQtd.setText("");
		tfCod.requestFocus();
		setBotoes(true,true,false,false,false,false,false);
	}
	public void atualizarCampos(){
		filmes.filme.setCod(tfCod.getText());
		if(filmes.localizar(tfCod)){
			tfCod.setText(filmes.filme.getCod());
			tfNome.setText(filmes.filme.getNome());
			tfGenero.setText(filmes.filme.getGenero());
			tfClassificacao.setText(filmes.filme.getClassificacao());
			tfPreco.setText(filmes.filme.getPreco());
			tfQtd.setText(filmes.filme.getQtd());
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