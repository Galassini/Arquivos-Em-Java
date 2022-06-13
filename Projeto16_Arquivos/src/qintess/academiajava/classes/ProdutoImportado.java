package qintess.academiajava.classes;

public class ProdutoImportado extends Produto{
	
	private String paisOrigem;

	public ProdutoImportado(String descricao, String categoria, double preco, String paisOrigem) {
		super(descricao, categoria, preco);
		this.setPaisOrigem(paisOrigem);
	}


	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	
	@Override
	public String mostrar() {
		return super.mostrar() 
				+ "\nPais de Origem: " + this.getPaisOrigem();
	}
	

}
