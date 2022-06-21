package repositorio;

import java.util.ArrayList;
import java.util.List;

import classes.Cliente;

public class RepoCliente {
	/*Vamos cadstrar os cliente em uma lista de dados esta lista guardara os dados em memoria. Todo
	novo cliente sera enserido nesta lista. Utilizaremos o camando List e a implementa��o ser� feita
	com o comando ArrayList. Ambos devem ser importados*/
	List<Cliente> lista = new ArrayList<Cliente>();
	
	
	//M�todos para cadastrar, listar, atualizar e deletar
	public void cadastrar(Cliente novoCliente) {
		//Adicionar novos clientes e a lista
		lista.add(novoCliente);
		System.out.println("Cliente Cadastrado!!");
	}
	public void listar(){
		
		for (int i = 0; i <lista.size(); i++) {
			System.out.println(lista.get(i).nome+"-"+lista.get(i).email+"-"+lista.get(i).cpf);
		}
	}
	public void atualizar(Cliente cliente){
		for(int i = 0 ; i < lista.size() ; i++){
			if(lista.get(i).nome.equals(cliente.nome)){
				lista.get(i).nome = cliente.nome;
				lista.get(i).email = cliente.email;
				lista.get(i).cpf = cliente.cpf;
				System.out.println("Cliente Atualizado com Sucesso");
				break; //For�a a sa�da do la�o for
			}
		}
		
		
	}
	public void deletar(String nome){
		for(int i = 0; i < lista.size(); i++){
			if(lista.get(i).nome.equals(nome)){
				lista.remove(i);
				System.out.println("Cliente apagado com sucesso");
				break;//For�a a sa�da do la�o for
			}
		}
	}
}
