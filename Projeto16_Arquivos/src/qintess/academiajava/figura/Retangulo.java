package qintess.academiajava.figura;

public class Retangulo extends Figura {
	private  double base;
	private double altura;
	
	public Retangulo (double base, double altura) {
		
		/* COMO VALIDAMOS NOS SET's NÃO É NECESSÁRIO MAIS ESSA VALIDAÇÃO.
		if (base <= 0 || altura <= 0) {
			throw new IllegalArgumentException("Os valores das medidas devem ser maior que zero.");
		}
		*/
		this.setBase(base);
		this.setAltura(altura);
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		if (base <= 0) {
			throw new IllegalArgumentException("A base deve ser maior que zero.");
		}
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		if (altura <= 0 ) {
			throw new IllegalArgumentException("A altura deve ser maior que zero.");
		}
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return this.getBase() * this.getAltura();
	}	
}