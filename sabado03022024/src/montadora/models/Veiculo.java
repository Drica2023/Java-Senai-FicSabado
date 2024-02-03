package montadora.models;

public class Veiculo extends Transporte {
	private int rodas;
	private String motor;
	private String nome;
	private String modelo;

	@Override
	public void movimentar() {

	}

	public void acelerar() {
		System.out.println("acelerando veiculo");
	}

	public int getRodas() {
		return rodas;
	}

	public void setRodas(int rodas) {
		this.rodas = rodas;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
