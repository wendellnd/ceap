 import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class EmCartaz extends JFrame{
	private JLabel label1, label2, label3, label4;
	private JButton btProx, btAnt, btPrimeiro,btUltimo,btMais10,btMenos10,btSair;
	private JTextField tfCodigo, tfTitulo, tfGenero, tfAno;
	private BD bd;
	private PreparedStatement st;
	private ResultSet resultSet;
	
	public static void main(String args[]) {
		JFrame frame = new EmCartaz();
		frame.setSize(700,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public EmCartaz(){
		inicializarComponentes();
		definirEventos();
	}
	
	public void inicializarComponentes(){
		setLayout(null);
		label1 = new JLabel("C�digo");
		label2 = new JLabel("Titulo");
		label3 = new JLabel("G�nero");
		label4 = new JLabel("Ano");
		tfCodigo = new JTextField(10);
		tfTitulo = new JTextField(35);
		tfGenero = new JTextField(15);
		tfAno = new JTextField(10);
		btProx = new JButton("Pr�ximo");
		btAnt = new JButton("Anterior");
		btPrimeiro = new JButton("Primeiro");
		btUltimo = new JButton("Ultimo");
		btMais10 = new JButton("Avan�a 10");
		btMenos10 = new JButton("Volta 10");
		btSair = new JButton("Sair");
		
		btAnt.setBounds(20,200,100,20);
		btProx.setBounds(580,200,100,20);
		
		tfTitulo.setBounds(250,20,200,20);
		tfCodigo.setBounds(250,380,200,20);
		tfAno.setBounds(250,410,200,20);
		tfGenero.setBounds(250,440,200,20);
		
		tfTitulo.setHorizontalAlignment(tfTitulo.CENTER);
		tfCodigo.setHorizontalAlignment(tfCodigo.CENTER);
		tfAno.setHorizontalAlignment(tfAno.CENTER);
		tfGenero.setHorizontalAlignment(tfGenero.CENTER);
		
		tfCodigo.setEditable(false);
		tfTitulo.setEditable(false);
		tfGenero.setEditable(false);
		tfAno.setEditable(false);
		
		add(label1);
		add(tfCodigo);
		add(label2);
		add(tfTitulo);
		add(label3);
		add(tfGenero);
		add(label4);
		add(tfAno);
		add(btPrimeiro);
		add(btAnt);
		add(btProx);
		add(btMais10);
		add(btMenos10);
		add(btSair);
		setTitle("Consulta de filmes");
		setResizable(false);
		bd = new BD();
		if(!bd.getConnection()){
			JOptionPane.showMessageDialog(null,"Falha na conex�o!");
			System.exit(0);
		}
		carregarTabela();
		atualizarCampos();	
	}
	
	public void definirEventos(){
		btProx.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					resultSet.next();
					atualizarCampos();
				}catch(SQLException erro){
			}
			}
		});
		
		btAnt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					resultSet.previous();
					atualizarCampos();
				}catch(SQLException erro){
			}
			}
		});
		
		btPrimeiro.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					resultSet.first();
					atualizarCampos();
				}catch(SQLException erro){
			}
			}
		});
		
		btUltimo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					resultSet.last();
					atualizarCampos();
				}catch(SQLException erro){
			}
			}
		});
		
		btMais10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					resultSet.relative(10);
					atualizarCampos();
				}catch(SQLException erro){
			}
			}
		});
		
		btMenos10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					if(resultSet.getRow()>10){
						resultSet.relative(-10);
					}else{
						resultSet.first();
					}
					atualizarCampos();
				}catch(SQLException erro){
			}
			}
		});
		
		btSair.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
				resultSet.close();
				st.close();
				}catch(SQLException erro){
				}
				bd.close();
				System.exit(0);
			}
		});
	}
	public void carregarTabela(){
		String sql = "select * from bilheterias";
		try{
			st = bd.c.prepareStatement(sql);
			resultSet = st.executeQuery();
		}catch (SQLException erro){
			JOptionPane.showMessageDialog(null,"Erro! " +erro.toString() );
		}
	}
	public void atualizarCampos(){
		try{
			if(resultSet.isAfterLast()){
				resultSet.last();
			}
			if(resultSet.isBeforeFirst()){
				resultSet.first();
			}
			tfCodigo.setText(resultSet.getString("Ranking"));
			tfTitulo.setText(resultSet.getString("Filme"));
			tfGenero.setText(resultSet.getString("Genero"));
			tfAno.setText(resultSet.getString("Ano"));
		} catch(SQLException erro){
			
		}
		
	}
	}