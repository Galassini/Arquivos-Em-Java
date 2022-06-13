package qintess.academiajava.classes;

import java.text.NumberFormat;

import qintess.academiajava.enumeracoes.Sexo;
import qintess.academiajava.interfaces.Documento;

public class Funcionario extends Pessoa {
	private Documento documento;
	private String cargo;
	private double salario;
	private double irpf; //Passo 1

	public Funcionario(Documento documento, String nome, String cargo, double salario) {
		super(nome);
		this.atribuirDados(documento, cargo, salario);
	}

	public Funcionario(Documento documento, String nome, int idade, String cargo, double salario) 
			throws IllegalAccessError {
		super(nome, idade);
		this.atribuirDados(documento, cargo, salario);
	}

	public Funcionario(Documento documento, String nome, int idade, Sexo sexo, String cargo, double salario) 
			throws IllegalAccessError{
		super(nome, idade, sexo);
		this.atribuirDados(documento, cargo, salario);
	}

	//MÉTODO AUXILIAR
	private void atribuirDados(Documento documento, String cargo, double salario) {
		this.setDocumento(documento);
		this.setCargo(cargo);
		this.setSalario(salario);
	}
	
	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
		this.irpf = this.calcularIRPF(); //Passo 3: (encapsulamento)
		//ao atribuir o salário já temos o irpf
	}
	
	//Passo 4: getter para o IRPF
	public double getIrpf() {
		return irpf;
	}

	@Override
	public String mostrar() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.mostrar())
		.append("\n").append(this.getDocumento().getNumero())
		.append("\nCargo: ").append(this.getCargo())
		.append("\nSalário: ").append(nf.format(this.getSalario()))
		.append("\nIRPF: ").append(nf.format(this.getIrpf()));
		
		return sb.toString();
		
		/*
		return super.mostrar() + 
				"\nCargo: " + this.getCargo() + 
				"\nSalário: " + this.getSalario();
		*/
	}
	
	//Passo 2 - Calculo do IRPF
	private double calcularIRPF() {
		double[] aliquotas = {0, 7.5, 15, 22.5, 27.5};
		double[] valores = {0, 1903.98, 2826.65, 3751.51, 4664,68};
		
		double baseCalculo = this.getSalario();
		double imposto = 0;
		
		for (int i = aliquotas.length - 1; i >= 0; i--) {
			if(baseCalculo > valores[i]) {
				imposto += (baseCalculo - valores[i]) * (aliquotas[i]/100);
				baseCalculo = valores[i];
			}
		}
		return imposto;
	}
}