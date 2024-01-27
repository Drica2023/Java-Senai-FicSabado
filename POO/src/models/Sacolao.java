package models;

public class Sacolao {
	
	public String nome;
	public String endereco;
	public String funcionarios;
	public int numero;
	
	public void vende() {
		
	System.out.println("Vendemos frutas!!!");
	}

	public String compra() {
		System.out.println("Compramos mercadoria!!!");
		
		return "Compramos mercadoria";
	}
	
}
