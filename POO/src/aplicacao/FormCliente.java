package aplicacao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import classes.PrjCliente;
import classes.PrjEndereco;
import classes.PrjUsuario;
import repositorio.RepoSistema;

public class FormCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdCliente;
	private JTextField txtNomeCliente;
	private JTextField txtEmail;
	private JTextField txtIdUsuario;
	private JTextField txtUsuario;
	private JPasswordField txtSenha;
	private JTextField txtIdEndereco;
	private JLabel lblIdEndereco;
	private JTextField txtLogradouro;
	private JLabel lblLogradouro;
	private JLabel lblNumero;
	private JTextField txtNumero;
	private JTextField txtBairro;
	private JLabel lblBairro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCliente frame = new FormCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormCliente() {
		setResizable(false);
		setType(Type.POPUP);
		setTitle("Gerenciar Clientes");
		setBackground(Color.MAGENTA);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 437);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdCliente = new JLabel("Id do Cliente");
		lblIdCliente.setFont(new Font("Lucida Sans", Font.BOLD, 13));
		lblIdCliente.setBounds(10, 19, 96, 14);
		contentPane.add(lblIdCliente);
		
		txtIdCliente = new JTextField();
		txtIdCliente.setBounds(10, 35, 86, 20);
		contentPane.add(txtIdCliente);
		txtIdCliente.setColumns(10);
		
		JLabel NomedoCliente = new JLabel("Nome do Cliente");
		NomedoCliente.setFont(new Font("Lucida Sans", Font.BOLD, 13));
		NomedoCliente.setBounds(123, 19, 114, 14);
		contentPane.add(NomedoCliente);
		
		txtNomeCliente = new JTextField();
		txtNomeCliente.setBounds(123, 35, 465, 20);
		contentPane.add(txtNomeCliente);
		txtNomeCliente.setColumns(10);
		
		JLabel lblEmailCliente = new JLabel("E-Mail");
		lblEmailCliente.setFont(new Font("Lucida Sans", Font.BOLD, 13));
		lblEmailCliente.setBounds(10, 80, 40, 14);
		contentPane.add(lblEmailCliente);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(10, 96, 578, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblIdUsuario = new JLabel("Id do Usu\u00E1rio");
		lblIdUsuario.setFont(new Font("Lucida Sans", Font.BOLD, 13));
		lblIdUsuario.setBounds(10, 161, 96, 14);
		contentPane.add(lblIdUsuario);
		
		txtIdUsuario = new JTextField();
		txtIdUsuario.setColumns(10);
		txtIdUsuario.setBounds(10, 177, 86, 20);
		contentPane.add(txtIdUsuario);
		
		JLabel lblNomeUsuario = new JLabel("Nome do Usu\u00E1rio");
		lblNomeUsuario.setFont(new Font("Lucida Sans", Font.BOLD, 13));
		lblNomeUsuario.setBounds(123, 161, 283, 14);
		contentPane.add(lblNomeUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(123, 177, 283, 20);
		contentPane.add(txtUsuario);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Lucida Sans", Font.BOLD, 13));
		lblSenha.setBounds(430, 161, 158, 14);
		contentPane.add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setEchoChar('*');
		txtSenha.setBounds(430, 177, 158, 20);
		contentPane.add(txtSenha);
		
		txtIdEndereco = new JTextField();
		txtIdEndereco.setColumns(10);
		txtIdEndereco.setBounds(10, 253, 86, 20);
		contentPane.add(txtIdEndereco);
		
		lblIdEndereco = new JLabel("Id do Endere\u00E7o");
		lblIdEndereco.setFont(new Font("Lucida Sans", Font.BOLD, 13));
		lblIdEndereco.setBounds(10, 237, 103, 14);
		contentPane.add(lblIdEndereco);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setColumns(10);
		txtLogradouro.setBounds(123, 253, 465, 20);
		contentPane.add(txtLogradouro);
		
		lblLogradouro = new JLabel("Logradouro");
		lblLogradouro.setFont(new Font("Lucida Sans", Font.BOLD, 13));
		lblLogradouro.setBounds(123, 237, 116, 14);
		contentPane.add(lblLogradouro);
		
		lblNumero = new JLabel("N\u00FAmero");
		lblNumero.setFont(new Font("Lucida Sans", Font.BOLD, 13));
		lblNumero.setBounds(10, 302, 53, 14);
		contentPane.add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(10, 318, 86, 20);
		contentPane.add(txtNumero);
		
		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		txtBairro.setBounds(123, 318, 465, 20);
		contentPane.add(txtBairro);
		
		lblBairro = new JLabel("Bairro");
		lblBairro.setFont(new Font("Lucida Sans", Font.BOLD, 13));
		lblBairro.setBounds(123, 302, 53, 14);
		contentPane.add(lblBairro);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Instancia da classe PrjUsuario
				PrjUsuario usuario = new PrjUsuario();
				//Instancia da classe PrjEndereco
				PrjEndereco endereco = new PrjEndereco();
				//Instancia da classe PrjCliente
				PrjCliente cliente = new PrjCliente();
				//vamos adicionar os clientes a memoria com o RepoSistema
				RepoSistema rs = new RepoSistema();
				
				//foi feita a conversao de string para int pois o parametro getText só
				//capta tipos String e o IdUsuario esta como Int pois será um numero.
				usuario.idUsuario = Integer.parseInt(txtIdUsuario.getText());
				usuario.nomeUsuario = txtUsuario.getText();
				usuario.senha = txtSenha.getText();
				
				endereco.idEndereco = Integer.parseInt(txtIdEndereco.getText());
				endereco.logradouro = txtLogradouro.getText();
				endereco.numero = txtNumero.getText();
				endereco.bairro = txtBairro.getText();
				
				cliente.idCliente = Integer.parseInt(txtIdCliente.getText());
				cliente.nomeCliente = txtNomeCliente.getText();
				cliente.email = txtEmail.getText();
				cliente.usuario = usuario;
				cliente.endereco = endereco;
				
				
				JOptionPane.showMessageDialog(null, rs.cadUsuario(usuario)+"\n"+rs.cadEndereco(endereco)+"\n"+rs.cadCliente(cliente));
			}
		});
		btnCadastrar.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		btnCadastrar.setBounds(10, 364, 578, 23);
		contentPane.add(btnCadastrar);
	}
}
