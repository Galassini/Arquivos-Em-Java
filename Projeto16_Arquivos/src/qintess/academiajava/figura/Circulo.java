package qintess.academiajava.figura;

public class Circulo extends Figura {
	private double raio;
	
	public Circulo (double raio) {
		this.setRaio(raio);
	}

	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		if (raio <= 0) {
			throw new IllegalArgumentException("O raio deve ser maior que zero.");
		}
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(this.getRaio(), 2); // pow (base, expoênte)
	}
}