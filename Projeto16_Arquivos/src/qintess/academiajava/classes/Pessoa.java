package qintess.academiajava.classes;

import qintess.academiajava.enumeracoes.Sexo;

public class Pessoa {
	private String nome;
	private int idade;
	private Sexo sexo;
	
	public Pessoa (String nome) {
		super();
		this.setNome(nome);	
	}
	
	public Pessoa (String nome, int idade) throws IllegalAccessError {
		this(nome);
		this.setIdade(idade);
	}
	
	public Pessoa (String nome, int idade, Sexo sexo) throws IllegalAccessError {
		this(nome, idade);
		this.setSexo(sexo);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) throws IllegalAccessError {
		if (idade < 0) {
			throw new IllegalAccessError("A idade não pode ser negativa.");
		}
		this.idade = idade;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	public String mostrar() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Nome: ")
		.append(this.getNome())
		.append("\nIdade: ")
		.append(this.getIdade())
		.append("\nSexo: ")
		.append(this.getSexo());
		
		return sb.toString(); 
	}
}