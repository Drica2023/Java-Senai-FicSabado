package helloWorld;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		System.out.println("Hello World");

		// tipo nome da variavel = valor atribuido
		String nome = "Adriana";
		System.out.println("Nome: " + nome);

		String numero1 = "12";
		String numero2 = "12";

		System.out.println(numero1 + numero2);

		int numero3 = 12;
		int numero4 = 12;

		System.out.println(numero3 + numero4);

		double numero5 = 12.83;
		double numero6 = 13.34;
		double numero7 = 15.00;

		System.out.println(numero5 + numero6);

		// estrutura de decisão
		// ==
		// !=
		// > <
		// >= <=
		// if (valor 1 decisão valor 2){ }

		if (numero3 > numero4) {
			System.out.println("O numero é maior");

		} else if (numero7 == numero4) {
			System.out.println("Os numeros são iguais ");
		} else if (numero3 < numero5) {
			System.out.println("Saldo aprovado");
		} else if (numero4 > numero7) {
			System.out.println("Saldo insuficiente");
		} else if (numero3 > numero5) {
			System.out.println("Sem Saldo");
		}
		
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite seu nome: ");
		String nomeDigitado = sc.next();
		System.out.println(nomeDigitado);		
		sc.close();
		
		
		

	}
}