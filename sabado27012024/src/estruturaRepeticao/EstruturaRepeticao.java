package estruturaRepeticao;

import java.util.Scanner;

public class EstruturaRepeticao {

	public static void main(String[] args) {

		// for

		/*
		 * for (int i = 0; i < 10; i++) { for (int j = 0; j < 10; j++)
		 * System.out.print("*"); System.out.println();
		 * 
		 * }
		 * 
		 * for (int i = 0; i < 8; i++) {
		 * 
		 * for (int j = 1; j < i; j++)
		 * 
		 * System.out.print(j); System.out.println();
		 * 
		 * }
		 * 
		 * System.out.println();
		 * 
		 * for (int i = 7; i > 1; i--) {
		 * 
		 * for (int j = 1; j < i; j++)
		 * 
		 * System.out.print(j); System.out.println();
		 * 
		 * }
		 * 
		 * 
		 * for (int i = 0; i < 21; i++) {
		 * 
		 * for (int j = 0; j < i; j++) {
		 * 
		 * 
		 * System.out.println();
		 * 
		 * 
		 * } }
		 * 
		 */
		/*
		 * int n = 6; for (int i = 1; i <= n; i++) {
		 * 
		 * for (int j = 1; j <= 2 * (n - i); j++) { System.out.print(" ");
		 * 
		 * }
		 * 
		 * for (int j = i; j >= 1; j--) { System.out.print(j + " "); } for (int j = 2; j
		 * <= i; j++) {
		 * 
		 * System.out.print(j + " ");
		 * 
		 * } System.out.println();
		 * 
		 * }
		 * 
		 */

		// while

		int numero = 0;
		while (numero < 10) {
			numero++;

			if (numero == 7) {
				break;
			} else if (numero == 6) {
				continue;
			}

			System.out.println(numero);
		}
		System.out.println("Finalizou");

		// do while

		Scanner sc = new Scanner(System.in);

		boolean sistema = true;

		String nome = "", email = "", senha = "";
		do {
			System.out.println(" 1 - Criar Cliente");
			System.out.println(" 2 - Ler o usuario");
			System.out.println(" 3 - Deletar usuario");
			System.out.println(" 4 - atualizar usuario");
			System.out.println(" 9 - Sair do sistema");
			int opcao = sc.nextInt();

			switch (opcao) {

			case 1: {

				System.out.println("Digite o nome: ");
				nome = sc.next();
				System.out.println("Digite o Email: ");
				email = sc.next();
				System.out.println("Digite o senha: ");
				senha = sc.next();
				System.out.println("Usuario criado com sucesso:  " + nome + " " + email + " " + senha);
				continue;
			}
			case 2: {
				System.out.println("Esse é o usuario");
				System.out.println("################");
				System.out.println(nome + " " + email + " " + senha);
				System.out.println("################");
				continue;
			}

			case 3: {
				{

					nome = "";
					email = "";
					senha = "";
					System.out.println("Usuario deletado com sucesso");
					continue;
				}
			}
			case 4: {
				{

					System.out.println("Nome atual: " + nome);
					System.out.println("Novo nome: ");
					nome = sc.next();
					System.out.println("Email atual: " + email);
					System.out.println("Novo Email: ");
					email = sc.next();
					System.out.println("Senha atual: " + email);
					System.out.println("Nova Senha: ");
					senha = sc.next();
					System.out.println("alterado com sucesso");
					System.out.println(nome + " " + email + " " + senha);

					continue;
				}

			}
			case 9: {
				sistema = false;
			}
			default: {
			}
			}

		} while (sistema != false);
		sc.close();
	}
}
