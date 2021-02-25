import java.util.Scanner;

public class DesvioSimples {

	public static void main(String[] args) {
		/*Uma ONG criou um jogo para alertar as pessoas sobre os riscos das drogas.
		 *Por se tratar de um assunto sensível, ficou decidido que a idade mínima para jogar é de 12 anos.
		 *Sua função é criar um programa que receba a idade do usuário e exiba a mensagem "Você pode jogar" caso ele tenha 12 anos ou mais. */
		
		Scanner leitor = new Scanner(System.in);
		int idade;
		System.out.print("Por favor, digite a sua idade!");
		idade = leitor.nextInt();
		System.out.println("Deixe-me verificar sua idade...");
		/*Aqui devemos criar uma solução para verificar a idade do usuário*/
		
		
		//abaixo temos um if simples, ou seja ele vai avaliar se a condição idade >=12 é verdadeira. se for verdadeira, o if fara um desvio e a linha com a mensagem será executado
		if (idade >= 12) {
			System.out.println("Você pode jogar!");
		};
		
		leitor.close();

	}

}
