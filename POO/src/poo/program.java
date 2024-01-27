package poo;

import models.Sacolao;

public class program {

	public static void main(String[] args) {
		
		Sacolao sacolao = new Sacolao();
		sacolao.nome = "SOS Adriana";
		sacolao.funcionarios = "2";
		sacolao.endereco = "Osasco - sp";
		
		sacolao.compra();
		sacolao.vende();
	}

}
