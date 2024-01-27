package poo;

import java.util.Scanner;

import models.Cliente;

public class program {

	public static void main(String[] args) {

		/*
		 * Sacolao sacolao = new Sacolao(); sacolao.nome = "SOS Adriana";
		 * sacolao.funcionarios = "2"; sacolao.endereco = "Osasco - sp";
		 * 
		 * sacolao.compra(); sacolao.vende();
		 */

		// do while
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente("", "", "");
		
		
		

		boolean sistema = true;

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
				cliente.nome = sc.next();
				System.out.println("Digite o Email: ");
				cliente.email = sc.next();
				System.out.println("Digite o senha: ");
				cliente.senha = sc.next();

				System.out.println(
						"Usuario criado com sucesso:  " + cliente.nome + " " + cliente.email + " " + cliente.senha);
				continue;
			}
			case 2: {
				System.out.println("Esse é o usuario");
				System.out.println("################");
				System.out.println(cliente.nome + " " + cliente.email + " " + cliente.senha);
				System.out.println("################");
				continue;
			}

			case 3: {
				{

					cliente.nome = "";
					cliente.email = "";
					cliente.senha = "";
					System.out.println("Usuario deletado com sucesso");
					continue;
				}
			}
			case 4: {
				{

					System.out.println("Nome atual: " + cliente.nome);
					System.out.println("Novo nome: ");
					cliente.nome = sc.next();
					System.out.println("Email atual: " + cliente.email);
					System.out.println("Novo Email: ");
					cliente.email = sc.next();
					System.out.println("Senha atual: " + cliente.senha);
					System.out.println("Nova Senha: ");
					cliente.senha = sc.next();
					System.out.println("alterado com sucesso");
					System.out.println(cliente.nome + " " + cliente.email + " " + cliente.senha);

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
