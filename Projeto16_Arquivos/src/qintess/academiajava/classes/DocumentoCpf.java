package qintess.academiajava.classes;

import qintess.academiajava.interfaces.Documento;

public class DocumentoCpf implements Documento {

	private String numero;

	public DocumentoCpf(String numero) {
		this.setNumero(numero);
	}

	

	@Override
	public void setNumero(String numero) {
		if (!numero.matches("[0-9]{11}")) {
			throw new NumberFormatException("CPF inválido!");
		}
		this.numero = numero;

	}

	@Override
	public String getNumero() {
		return "CPF: " + this.numero;
	}

}