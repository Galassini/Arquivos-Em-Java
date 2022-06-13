package qintess.academiajava.classes;

public class AutomovelEscolar extends Automovel{
	private int capacidade;
	
	public AutomovelEscolar(String marca, String motor, int capacidade) {
		super(marca, motor);
		this.setCapacidade(capacidade);
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	@Override
	public String mostrar() {
		return super.mostrar() + "\nCapacidade" + getCapacidade();
	}
	
	
	

}
