package model;

public class Aquario {

	private boolean peixe;
	private boolean agua;
	private boolean luz;

	private int qtdFuncionarios;
	private int qtdPeixes;

	public boolean isPeixe() {
		return peixe;
	}

	public void setPeixe(boolean peixe) {
		this.peixe = peixe;
	}

	public boolean isAgua() {
		return agua;
	}

	public void setAgua(boolean agua) {
		this.agua = agua;
	}

	public boolean isLuz() {
		return luz;
	}

	public void setLuz(boolean luz) {
		this.luz = luz;
	}

	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}

	public int getQtdPeixes() {
		return qtdPeixes;
	}

	public void setQtdPeixes(int qtdPeixes) {
		this.qtdPeixes = qtdPeixes;
	}

}
