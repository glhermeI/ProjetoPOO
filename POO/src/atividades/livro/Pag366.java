package atividades.livro;
//Programa de adi��o que insere dois numeros, ent�o exibe a soma deles
import java.util.Scanner; // programa utiliza a classe Scanner
		
public class Pag366 {

	public static void main(String[] args) {
		//Criar um Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		int number1; // primeiro numero da soma
		int number2; // segundo numero da soma
		int sum; // soma de number1 e number2
		
		System.out.print("Digite o Primeiro Numero:"); //prompt
		number1 = input.nextInt(); // Le o primeiro numero fornecido pelo usuario
		
		System.out.print("Digite o Segundo Numero:"); // prompt
		number2 = input.nextInt(); // Le o segundo numero fornecido pelo usuario
		
		sum = number1 + number2; //soma os numereros, depois armazena o tatal em sum
		
		System.out.printf("A soma �: %d%n",sum); //Exibe a Soma

	}//fim do m�todo main

}// fim da classe Pag36
