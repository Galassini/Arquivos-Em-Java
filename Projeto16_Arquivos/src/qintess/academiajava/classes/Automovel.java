package qintess.academiajava.classes;

public class Automovel {
	private String marca;
	private String modelo;
	private int ano;
	private final String tipoMotor;

	// construtores
	public Automovel(String marca, String motor) {
		this.setMarca(marca);
		this.tipoMotor = motor;
	}

	public Automovel(String marca, String modelo, String motor) {
		this(marca, motor);
		this.setModelo(modelo);
	}

	public Automovel(String marca, String modelo, int ano, String motor) {
		this(marca, modelo, motor);
		this.setAno(ano);

	}
	// Getters and Setters

	public String getMarca() {
		return marca;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Automovel) {
			Automovel auto = (Automovel) obj;
			if (this.getMarca().equals(auto.getMarca()) && this.getModelo().equals(auto.getModelo())
					&& this.getAno() == auto.getAno() && this.getTipoMotor().equals(auto.getTipoMotor())) {
				return true;
			}
		}
		return false;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano < 1960) {
			throw new NumberFormatException("Ano minimo 1960, entrada invalida");
		}
		this.ano = ano;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	public String mostrar() {
		String resposta = "Marca: " + this.getMarca();
		if (this.getModelo() != null) {
			resposta += "\nModelo: " + this.getModelo();
		}

		if (this.getAno() != 00) {
			resposta += "\nAno: " + this.getAno();
		}
		resposta += "\nTipo Motor" + this.getTipoMotor();

		return resposta;
	}

	@Override
	public String toString() {

		return "(" + this.getMarca() + "," + this.getModelo() + "," + this.getAno() + ")";

	}
}
