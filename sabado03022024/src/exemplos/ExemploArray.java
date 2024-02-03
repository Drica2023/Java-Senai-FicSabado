package exemplos;

import java.util.ArrayList;

import model.Aquario;
import montadora.models.Carro;

public class ExemploArray {

	public static void main(String[] args) {
		
		Carro carros = new Carro();
		carros.setNome("honda 1996 vetec asparido turbo");
		
		carros.acelerar();
		

		String nomes[] = new String[4];
		nomes[0] = "Adriana";
		nomes[1] = "Heloisa";
		nomes[2] = "Bob";
		nomes[3] = "Carlos";

		for (int i = 0; i < nomes.length; i++) {

			System.out.println(nomes[i]);
		}

		ArrayList<String> carrosExemplo = new ArrayList<>();
		carrosExemplo.add("Corsa");
		carrosExemplo.add("Civic");

		System.out.println(carros);

		for (String carro : carrosExemplo) {
			System.out.println(carro);
		}

		// Array aquarios 1 ...* objetos de aquario
		Aquario aquarios[] = new Aquario[5];
		// Aquario grande => tem tubarao, tem animais silvestres
		Aquario aquario = new Aquario();
		aquario.setAgua(true);
		aquario.setLuz(true);
		if (aquario.isAgua()) {
			aquario.setPeixe(true);
		}
		aquarios[2] = aquario;

	}

}
