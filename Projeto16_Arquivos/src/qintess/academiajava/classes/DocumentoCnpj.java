package qintess.academiajava.classes;

import qintess.academiajava.interfaces.Documento;

public class DocumentoCnpj  implements Documento  {

	private String numero;
	

	public DocumentoCnpj(String numero) {
		this.setNumero(numero);
	}

	@Override
	public void setNumero(String numero) {
		
		if(!numero.matches("[0-9]{14}")) {
		throw new NumberFormatException("CNPJ inválido");	
		}
		this.numero = numero;
		
	}

	@Override
	public String getNumero() {
		return "CNPJ: " + this.numero;
	}
	
}