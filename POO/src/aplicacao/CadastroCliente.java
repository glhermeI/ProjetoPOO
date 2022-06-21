package aplicacao;

import classes.PrjCliente;
import classes.PrjEndereco;
import classes.PrjUsuario;
import repositorio.RepoSistema;

public class CadastroCliente {

	public static void main(String[] args) {
		PrjUsuario usuario = new PrjUsuario();
		PrjEndereco endereco = new PrjEndereco();
		PrjCliente cliente = new PrjCliente();
		
		usuario.idUsuario = 10;
		usuario.nomeUsuario = "Claudinho";
		usuario.senha = "123";
		
		endereco.idEndereco = 53;
		endereco.logradouro = "Rua Jos�";
		endereco.numero = "10";
		endereco.bairro = "Tatuap�";
		
		cliente.idCliente = 54;
		cliente.nomeCliente = "Jeremias";
		cliente.email = "jeremias@terra.com.br";
		cliente.usuario = usuario;
		cliente.endereco = endereco;
		
		RepoSistema rs = new RepoSistema();
		System.out.println(rs.cadUsuario(usuario));
		System.out.println(rs.cadEndereco(endereco));
		System.out.println(rs.cadCliente(cliente));

	}

}
