package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		String nome;
		String email;
		int idade;
		System.out.println("Digite o nome:");
		nome = scanner.next();
		System.out.println("Digite o email:");
		email = scanner.next();
		System.out.println("Digite a idade:");
		idade = scanner.nextInt();

		System.out.println("Seu nome é : " + nome + "  email: " + email + "  idade: " + idade);

			// && e ||

		if (22 > 20 && 30 > 20 && 40 > 30) {
			System.out.println("Entrou na condição &&");

		}
		if (22 > 20 || 30 > 40) {

			System.out.println("Entrou na condição || (ou)");
		}

		scanner.close();

	}

}
