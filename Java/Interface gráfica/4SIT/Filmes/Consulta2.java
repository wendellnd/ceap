import java.sql.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class Consulta2 extends JFrame {
	private JLabel label1;
	private JScrollPane scrollTable;
	private JTable table;
	private BD bd;
	private PreparedStatement st;
	private ResultSet rs;
	private JComboBox cb1, cb2, cb3;
	private String[] vet1 = {"Disney","Fox","Universal","Paramount"};
	private String[] vet2 = {"1997","2009","2012","2015","2019"};
	private String[] vet3 = {"Heróis","Ação","Drama","Ficção"};
	private JButton bt1;

	public static void main(String args[]) {
		JFrame frame = new Consulta2();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public Consulta2() {
		inicializarComponentes();
		definirEventos();
	}

	public void inicializarComponentes() {
		setLayout(null);
		setTitle("Tabela de consultas");
		setBounds(200, 200, 600, 500);
		setResizable(false);
		bt1 = new JButton("Mostrar Tudo");
		bt1.setBounds(380, 35, 150, 25);
		add(bt1);
		cb1 = new JComboBox(vet1);
		cb2 = new JComboBox(vet2);
		cb3 = new JComboBox(vet3);
		cb1.setBounds(50, 35, 100, 25);
		add(cb1);
		cb2.setBounds(160, 35, 100, 25);
		add(cb2);
		cb3.setBounds(270, 35, 100, 25);
		add(cb3);
		label1 = new JLabel("Filtros");
		label1.setBounds(50, 10, 200, 25);
		scrollTable = new JScrollPane();
		scrollTable.setBounds(50, 100, 500, 300);
		add(scrollTable);
		add(label1);
		bd = new BD();
	}

	public void definirEventos() {
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String a = "select * from bilheterias;";
					if(!bd.getConnection()){
						JOptionPane.showMessageDialog(null,"Falha na conexão!");
						System.exit(0);
					}
					st = bd.c.prepareStatement(a);
					rs = st.executeQuery();
					DefaultTableModel tableModel = new DefaultTableModel(
							new String[]{},0){
					};
					int qtdeColunas = rs.getMetaData().getColumnCount();
					for(int indice = 1; indice <= qtdeColunas; indice++){
						String nome = "";
						switch(indice) {
						case 1: nome = "Ranking";
						break;
						case 2: nome = "Ano";
						break;
						case 3: nome = "Filme";
						break;
						case 4: nome = "Distribuidor";
						break;
						case 5: nome = "BilheteriasU$";
						break;
						case 6: nome = "Gênero";
						break;
						}
						tableModel.addColumn(nome);
					}
					table = new JTable(tableModel);
					DefaultTableModel dtm = (DefaultTableModel) table.getModel();
					
					while(rs.next()){
						try{
							String[] dados = new String[qtdeColunas];
							for(int i = 1; i<=qtdeColunas; i++){
								dados[i-1] = rs.getString(i);
								System.out.println(rs.getString(i));
							}
							dtm.addRow(dados);
							System.out.println();
						}catch (SQLException erro){
							
						}
						scrollTable.setViewportView(table);
					}
					rs.close();
					st.close();
					bd.close();
				}catch (Exception erro){
					JOptionPane.showMessageDialog(null,"Comando Inválido"+erro.toString());
				}
			}
		});
		cb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = "";
				if(cb1.getSelectedIndex() == 0) {
					a = "select * from bilheterias where Distribuidor = 'Walt Disney Studios Motion Pictures';";
					try{
						if(!bd.getConnection()){
							JOptionPane.showMessageDialog(null,"Falha na conexão!");
							System.exit(0);
						}
						st = bd.c.prepareStatement(a);
						rs = st.executeQuery();
						DefaultTableModel tableModel = new DefaultTableModel(
								new String[]{},0){
						};
						int qtdeColunas = rs.getMetaData().getColumnCount();
						for(int indice = 1; indice <= qtdeColunas; indice++){
							String nome = "";
							switch(indice) {
							case 1: nome = "Ranking";
							break;
							case 2: nome = "Ano";
							break;
							case 3: nome = "Filme";
							break;
							case 4: nome = "Distribuidor";
							break;
							case 5: nome = "BilheteriasU$";
							break;
							case 6: nome = "Gênero";
							break;
							}	
							tableModel.addColumn(nome);
						}
						table = new JTable(tableModel);
						DefaultTableModel dtm = (DefaultTableModel) table.getModel();
						
						while(rs.next()){
							try{
								String[] dados = new String[qtdeColunas];
								for(int i = 1; i<=qtdeColunas; i++){
									dados[i-1] = rs.getString(i);
									System.out.println(rs.getString(i));
								}
								dtm.addRow(dados);
								System.out.println();
							}catch (SQLException erro){
								
							}
							scrollTable.setViewportView(table);
						}
						rs.close();
						st.close();
						bd.close();
					}catch (Exception erro){
						JOptionPane.showMessageDialog(null,"Comando Inválido"+erro.toString());
					}
				}else if(cb1.getSelectedIndex() == 1) {
					a = "select * from bilheterias where Distribuidor = '20th Century Fox';";
					try{
						if(!bd.getConnection()){
							JOptionPane.showMessageDialog(null,"Falha na conexão!");
							System.exit(0);
						}
						st = bd.c.prepareStatement(a);
						rs = st.executeQuery();
						DefaultTableModel tableModel = new DefaultTableModel(
								new String[]{},0){
						};
						int qtdeColunas = rs.getMetaData().getColumnCount();
						for(int indice = 1; indice <= qtdeColunas; indice++){
							String nome = "";
							switch(indice) {
							case 1: nome = "Ranking";
							break;
							case 2: nome = "Ano";
							break;
							case 3: nome = "Filme";
							break;
							case 4: nome = "Distribuidor";
							break;
							case 5: nome = "BilheteriasU$";
							break;
							case 6: nome = "Gênero";
							break;
							}	
							tableModel.addColumn(nome);
						}
						table = new JTable(tableModel);
						DefaultTableModel dtm = (DefaultTableModel) table.getModel();
						
						while(rs.next()){
							try{
								String[] dados = new String[qtdeColunas];
								for(int i = 1; i<=qtdeColunas; i++){
									dados[i-1] = rs.getString(i);
									System.out.println(rs.getString(i));
								}
								dtm.addRow(dados);
								System.out.println();
							}catch (SQLException erro){
								
							}
							scrollTable.setViewportView(table);
						}
						rs.close();
						st.close();
						bd.close();
					}catch (Exception erro){
						JOptionPane.showMessageDialog(null,"Comando Inválido"+erro.toString());
					}
				}else if(cb1.getSelectedIndex() == 2) {
					a = "select * from bilheterias where Distribuidor = 'Universal Pictures';";
					try{
						if(!bd.getConnection()){
							JOptionPane.showMessageDialog(null,"Falha na conexão!");
							System.exit(0);
						}
						st = bd.c.prepareStatement(a);
						rs = st.executeQuery();
						DefaultTableModel tableModel = new DefaultTableModel(
								new String[]{},0){
						};
						int qtdeColunas = rs.getMetaData().getColumnCount();
						for(int indice = 1; indice <= qtdeColunas; indice++){
							String nome = "";
							switch(indice) {
							case 1: nome = "Ranking";
							break;
							case 2: nome = "Ano";
							break;
							case 3: nome = "Filme";
							break;
							case 4: nome = "Distribuidor";
							break;
							case 5: nome = "BilheteriasU$";
							break;
							case 6: nome = "Gênero";
							break;
							}	
							tableModel.addColumn(nome);
						}
						table = new JTable(tableModel);
						DefaultTableModel dtm = (DefaultTableModel) table.getModel();
						
						while(rs.next()){
							try{
								String[] dados = new String[qtdeColunas];
								for(int i = 1; i<=qtdeColunas; i++){
									dados[i-1] = rs.getString(i);
									System.out.println(rs.getString(i));
								}
								dtm.addRow(dados);
								System.out.println();
							}catch (SQLException erro){
								
							}
							scrollTable.setViewportView(table);
						}
						rs.close();
						st.close();
						bd.close();
					}catch (Exception erro){
						JOptionPane.showMessageDialog(null,"Comando Inválido"+erro.toString());
					}
				}else if(cb1.getSelectedIndex() == 3) {
					a = "select * from bilheterias where Distribuidor = 'Paramount Pictures/20th Century Fox';";
					try{
						if(!bd.getConnection()){
							JOptionPane.showMessageDialog(null,"Falha na conexão!");
							System.exit(0);
						}
						st = bd.c.prepareStatement(a);
						rs = st.executeQuery();
						DefaultTableModel tableModel = new DefaultTableModel(
								new String[]{},0){
						};
						int qtdeColunas = rs.getMetaData().getColumnCount();
						for(int indice = 1; indice <= qtdeColunas; indice++){
							String nome = "";
							switch(indice) {
							case 1: nome = "Ranking";
							break;
							case 2: nome = "Ano";
							break;
							case 3: nome = "Filme";
							break;
							case 4: nome = "Distribuidor";
							break;
							case 5: nome = "BilheteriasU$";
							break;
							case 6: nome = "Gênero";
							break;
							}	
							tableModel.addColumn(nome);
						}
						table = new JTable(tableModel);
						DefaultTableModel dtm = (DefaultTableModel) table.getModel();
						
						while(rs.next()){
							try{
								String[] dados = new String[qtdeColunas];
								for(int i = 1; i<=qtdeColunas; i++){
									dados[i-1] = rs.getString(i);
									System.out.println(rs.getString(i));
								}
								dtm.addRow(dados);
								System.out.println();
							}catch (SQLException erro){
								
							}
							scrollTable.setViewportView(table);
						}
						rs.close();
						st.close();
						bd.close();
					}catch (Exception erro){
						JOptionPane.showMessageDialog(null,"Comando Inválido"+erro.toString());
					}
				}
			}
		});
		cb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("a");
				String a = "";
				if(cb2.getSelectedIndex() == 0) {
					a = "select * from bilheterias where Ano = 1997;";
					try{
						if(!bd.getConnection()){
							JOptionPane.showMessageDialog(null,"Falha na conexão!");
							System.exit(0);
						}
						st = bd.c.prepareStatement(a);
						rs = st.executeQuery();
						DefaultTableModel tableModel = new DefaultTableModel(
								new String[]{},0){
						};
						int qtdeColunas = rs.getMetaData().getColumnCount();
						for(int indice = 1; indice <= qtdeColunas; indice++){
							String nome = "";
							switch(indice) {
							case 1: nome = "Ranking";
							break;
							case 2: nome = "Ano";
							break;
							case 3: nome = "Filme";
							break;
							case 4: nome = "Distribuidor";
							break;
							case 5: nome = "BilheteriasU$";
							break;
							case 6: nome = "Gênero";
							break;
							}	
							tableModel.addColumn(nome);
						}
						table = new JTable(tableModel);
						DefaultTableModel dtm = (DefaultTableModel) table.getModel();
						
						while(rs.next()){
							try{
								String[] dados = new String[qtdeColunas];
								for(int i = 1; i<=qtdeColunas; i++){
									dados[i-1] = rs.getString(i);
									System.out.println(rs.getString(i));
								}
								dtm.addRow(dados);
								System.out.println();
							}catch (SQLException erro){
								
							}
							scrollTable.setViewportView(table);
						}
						rs.close();
						st.close();
						bd.close();
					}catch (Exception erro){
						JOptionPane.showMessageDialog(null,"Comando Inválido"+erro.toString());
					}
				}else if(cb2.getSelectedIndex() == 1) {
					a = "select * from bilheterias where Ano = 2009;";
					try{
						if(!bd.getConnection()){
							JOptionPane.showMessageDialog(null,"Falha na conexão!");
							System.exit(0);
						}
						st = bd.c.prepareStatement(a);
						rs = st.executeQuery();
						DefaultTableModel tableModel = new DefaultTableModel(
								new String[]{},0){
						};
						int qtdeColunas = rs.getMetaData().getColumnCount();
						for(int indice = 1; indice <= qtdeColunas; indice++){
							String nome = "";
							switch(indice) {
							case 1: nome = "Ranking";
							break;
							case 2: nome = "Ano";
							break;
							case 3: nome = "Filme";
							break;
							case 4: nome = "Distribuidor";
							break;
							case 5: nome = "BilheteriasU$";
							break;
							case 6: nome = "Gênero";
							break;
							}	
							tableModel.addColumn(nome);
						}
						table = new JTable(tableModel);
						DefaultTableModel dtm = (DefaultTableModel) table.getModel();
						
						while(rs.next()){
							try{
								String[] dados = new String[qtdeColunas];
								for(int i = 1; i<=qtdeColunas; i++){
									dados[i-1] = rs.getString(i);
									System.out.println(rs.getString(i));
								}
								dtm.addRow(dados);
								System.out.println();
							}catch (SQLException erro){
								
							}
							scrollTable.setViewportView(table);
						}
						rs.close();
						st.close();
						bd.close();
					}catch (Exception erro){
						JOptionPane.showMessageDialog(null,"Comando Inválido"+erro.toString());
					}
				}else if(cb2.getSelectedIndex() == 2) {
					a = "select * from bilheterias where Ano = 2012;";
					try{
						if(!bd.getConnection()){
							JOptionPane.showMessageDialog(null,"Falha na conexão!");
							System.exit(0);
						}
						st = bd.c.prepareStatement(a);
						rs = st.executeQuery();
						DefaultTableModel tableModel = new DefaultTableModel(
								new String[]{},0){
						};
						int qtdeColunas = rs.getMetaData().getColumnCount();
						for(int indice = 1; indice <= qtdeColunas; indice++){
							String nome = "";
							switch(indice) {
							case 1: nome = "Ranking";
							break;
							case 2: nome = "Ano";
							break;
							case 3: nome = "Filme";
							break;
							case 4: nome = "Distribuidor";
							break;
							case 5: nome = "BilheteriasU$";
							break;
							case 6: nome = "Gênero";
							break;
							}	
							tableModel.addColumn(nome);
						}
						table = new JTable(tableModel);
						DefaultTableModel dtm = (DefaultTableModel) table.getModel();
						
						while(rs.next()){
							try{
								String[] dados = new String[qtdeColunas];
								for(int i = 1; i<=qtdeColunas; i++){
									dados[i-1] = rs.getString(i);
									System.out.println(rs.getString(i));
								}
								dtm.addRow(dados);
								System.out.println();
							}catch (SQLException erro){
								
							}
							scrollTable.setViewportView(table);
						}
						rs.close();
						st.close();
						bd.close();
					}catch (Exception erro){
						JOptionPane.showMessageDialog(null,"Comando Inválido"+erro.toString());
					}
				}else if(cb2.getSelectedIndex() == 3) {
					a = "select * from bilheterias where Ano = 2015;";
					try{
						if(!bd.getConnection()){
							JOptionPane.showMessageDialog(null,"Falha na conexão!");
							System.exit(0);
						}
						st = bd.c.prepareStatement(a);
						rs = st.executeQuery();
						DefaultTableModel tableModel = new DefaultTableModel(
								new String[]{},0){
						};
						int qtdeColunas = rs.getMetaData().getColumnCount();
						for(int indice = 1; indice <= qtdeColunas; indice++){
							String nome = "";
							switch(indice) {
							case 1: nome = "Ranking";
							break;
							case 2: nome = "Ano";
							break;
							case 3: nome = "Filme";
							break;
							case 4: nome = "Distribuidor";
							break;
							case 5: nome = "BilheteriasU$";
							break;
							case 6: nome = "Gênero";
							break;
							}	
							tableModel.addColumn(nome);
						}
						table = new JTable(tableModel);
						DefaultTableModel dtm = (DefaultTableModel) table.getModel();
						
						while(rs.next()){
							try{
								String[] dados = new String[qtdeColunas];
								for(int i = 1; i<=qtdeColunas; i++){
									dados[i-1] = rs.getString(i);
									System.out.println(rs.getString(i));
								}
								dtm.addRow(dados);
								System.out.println();
							}catch (SQLException erro){
								
							}
							scrollTable.setViewportView(table);
						}
						rs.close();
						st.close();
						bd.close();
					}catch (Exception erro){
						JOptionPane.showMessageDialog(null,"Comando Inválido"+erro.toString());
					}
				}else if(cb2.getSelectedIndex() == 4) {
					a = "select * from bilheterias where Ano = 2019;";
					try{
						if(!bd.getConnection()){
							JOptionPane.showMessageDialog(null,"Falha na conexão!");
							System.exit(0);
						}
						st = bd.c.prepareStatement(a);
						rs = st.executeQuery();
						DefaultTableModel tableModel = new DefaultTableModel(
								new String[]{},0){
						};
						int qtdeColunas = rs.getMetaData().getColumnCount();
						for(int indice = 1; indice <= qtdeColunas; indice++){
							String nome = "";
							switch(indice) {
							case 1: nome = "Ranking";
							break;
							case 2: nome = "Ano";
							break;
							case 3: nome = "Filme";
							break;
							case 4: nome = "Distribuidor";
							break;
							case 5: nome = "BilheteriasU$";
							break;
							case 6: nome = "Gênero";
							break;
							}	
							tableModel.addColumn(nome);
						}
						table = new JTable(tableModel);
						DefaultTableModel dtm = (DefaultTableModel) table.getModel();
						
						while(rs.next()){
							try{
								String[] dados = new String[qtdeColunas];
								for(int i = 1; i<=qtdeColunas; i++){
									dados[i-1] = rs.getString(i);
									System.out.println(rs.getString(i));
								}
								dtm.addRow(dados);
								System.out.println();
							}catch (SQLException erro){
								
							}
							scrollTable.setViewportView(table);
						}
						rs.close();
						st.close();
						bd.close();
					}catch (Exception erro){
						JOptionPane.showMessageDialog(null,"Comando Inválido"+erro.toString());
					}
				}
			}
		});
		cb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = "";
				if(cb3.getSelectedIndex() == 0) {
					a = "select * from bilheterias where Genero = 'Heróis';";
					try{
						if(!bd.getConnection()){
							JOptionPane.showMessageDialog(null,"Falha na conexão!");
							System.exit(0);
						}
						st = bd.c.prepareStatement(a);
						rs = st.executeQuery();
						DefaultTableModel tableModel = new DefaultTableModel(
								new String[]{},0){
						};
						int qtdeColunas = rs.getMetaData().getColumnCount();
						for(int indice = 1; indice <= qtdeColunas; indice++){
							String nome = "";
							switch(indice) {
							case 1: nome = "Ranking";
							break;
							case 2: nome = "Ano";
							break;
							case 3: nome = "Filme";
							break;
							case 4: nome = "Distribuidor";
							break;
							case 5: nome = "BilheteriasU$";
							break;
							case 6: nome = "Gênero";
							break;
							}	
							tableModel.addColumn(nome);
						}
						table = new JTable(tableModel);
						DefaultTableModel dtm = (DefaultTableModel) table.getModel();
						
						while(rs.next()){
							try{
								String[] dados = new String[qtdeColunas];
								for(int i = 1; i<=qtdeColunas; i++){
									dados[i-1] = rs.getString(i);
									System.out.println(rs.getString(i));
								}
								dtm.addRow(dados);
								System.out.println();
							}catch (SQLException erro){
								
							}
							scrollTable.setViewportView(table);
						}
						rs.close();
						st.close();
						bd.close();
					}catch (Exception erro){
						JOptionPane.showMessageDialog(null,"Comando Inválido"+erro.toString());
					}
				}else if(cb3.getSelectedIndex() == 1) {
					a = "select * from bilheterias where Genero = 'Ação';";
					try{
						if(!bd.getConnection()){
							JOptionPane.showMessageDialog(null,"Falha na conexão!");
							System.exit(0);
						}
						st = bd.c.prepareStatement(a);
						rs = st.executeQuery();
						DefaultTableModel tableModel = new DefaultTableModel(
								new String[]{},0){
						};
						int qtdeColunas = rs.getMetaData().getColumnCount();
						for(int indice = 1; indice <= qtdeColunas; indice++){
							String nome = "";
							switch(indice) {
							case 1: nome = "Ranking";
							break;
							case 2: nome = "Ano";
							break;
							case 3: nome = "Filme";
							break;
							case 4: nome = "Distribuidor";
							break;
							case 5: nome = "BilheteriasU$";
							break;
							case 6: nome = "Gênero";
							break;
							}	
							tableModel.addColumn(nome);
						}
						table = new JTable(tableModel);
						DefaultTableModel dtm = (DefaultTableModel) table.getModel();
						
						while(rs.next()){
							try{
								String[] dados = new String[qtdeColunas];
								for(int i = 1; i<=qtdeColunas; i++){
									dados[i-1] = rs.getString(i);
									System.out.println(rs.getString(i));
								}
								dtm.addRow(dados);
								System.out.println();
							}catch (SQLException erro){
								
							}
							scrollTable.setViewportView(table);
						}
						rs.close();
						st.close();
						bd.close();
					}catch (Exception erro){
						JOptionPane.showMessageDialog(null,"Comando Inválido"+erro.toString());
					}
				}else if(cb3.getSelectedIndex() == 2) {
					a = "select * from bilheterias where Genero = 'Drama';";
					try{
						if(!bd.getConnection()){
							JOptionPane.showMessageDialog(null,"Falha na conexão!");
							System.exit(0);
						}
						st = bd.c.prepareStatement(a);
						rs = st.executeQuery();
						DefaultTableModel tableModel = new DefaultTableModel(
								new String[]{},0){
						};
						int qtdeColunas = rs.getMetaData().getColumnCount();
						for(int indice = 1; indice <= qtdeColunas; indice++){
							String nome = "";
							switch(indice) {
							case 1: nome = "Ranking";
							break;
							case 2: nome = "Ano";
							break;
							case 3: nome = "Filme";
							break;
							case 4: nome = "Distribuidor";
							break;
							case 5: nome = "BilheteriasU$";
							break;
							case 6: nome = "Gênero";
							break;
							}	
							tableModel.addColumn(nome);
						}
						table = new JTable(tableModel);
						DefaultTableModel dtm = (DefaultTableModel) table.getModel();
						
						while(rs.next()){
							try{
								String[] dados = new String[qtdeColunas];
								for(int i = 1; i<=qtdeColunas; i++){
									dados[i-1] = rs.getString(i);
									System.out.println(rs.getString(i));
								}
								dtm.addRow(dados);
								System.out.println();
							}catch (SQLException erro){
								
							}
							scrollTable.setViewportView(table);
						}
						rs.close();
						st.close();
						bd.close();
					}catch (Exception erro){
						JOptionPane.showMessageDialog(null,"Comando Inválido"+erro.toString());
					}
				}else if(cb3.getSelectedIndex() == 3) {
					a = "select * from bilheterias where Genero = 'Ficção';";
					try{
						if(!bd.getConnection()){
							JOptionPane.showMessageDialog(null,"Falha na conexão!");
							System.exit(0);
						}
						st = bd.c.prepareStatement(a);
						rs = st.executeQuery();
						DefaultTableModel tableModel = new DefaultTableModel(
								new String[]{},0){
						};
						int qtdeColunas = rs.getMetaData().getColumnCount();
						for(int indice = 1; indice <= qtdeColunas; indice++){
							String nome = "";
							switch(indice) {
							case 1: nome = "Ranking";
							break;
							case 2: nome = "Ano";
							break;
							case 3: nome = "Filme";
							break;
							case 4: nome = "Distribuidor";
							break;
							case 5: nome = "BilheteriasU$";
							break;
							case 6: nome = "Gênero";
							break;
							}	
							tableModel.addColumn(nome);
						}
						table = new JTable(tableModel);
						DefaultTableModel dtm = (DefaultTableModel) table.getModel();
						
						while(rs.next()){
							try{
								String[] dados = new String[qtdeColunas];
								for(int i = 1; i<=qtdeColunas; i++){
									dados[i-1] = rs.getString(i);
									System.out.println(rs.getString(i));
								}
								dtm.addRow(dados);
								System.out.println();
							}catch (SQLException erro){
								
							}
							scrollTable.setViewportView(table);
						}
						rs.close();
						st.close();
						bd.close();
					}catch (Exception erro){
						JOptionPane.showMessageDialog(null,"Comando Inválido"+erro.toString());
					}
				}
			}
		});
	}
}
