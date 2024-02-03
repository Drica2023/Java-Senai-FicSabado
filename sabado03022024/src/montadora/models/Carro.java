package montadora.models;

public class Carro extends Veiculo implements SuperPoderes {
	private double tamanhoPortaMalas;
	
	@Override
	public void voar() {
				
	}
	
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
