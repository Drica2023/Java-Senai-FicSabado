package montadora.models;

public class Carro extends Veiculo {
	private double tamanhoPortaMalas;
	
	@Override
	public void acelerar() {
		System.out.println("Acelerando Carro");
	}

	public double getTamanhoPortaMalas() {
		return tamanhoPortaMalas;
	}

	public void setTamanhoPortaMalas(double tamanhoPortaMalas) {
		this.tamanhoPortaMalas = tamanhoPortaMalas;
	}
	
	
}
