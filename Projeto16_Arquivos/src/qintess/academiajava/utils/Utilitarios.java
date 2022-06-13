package qintess.academiajava.utils;

import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilitarios {
	
	public static final String CAMINHO_ARQUIVO = "C:\\AcademiaJava\\Arquivos\\";

	// Metodo que recebe dois par�metros n�mericos e retorna sua soma 
	
	public static double somar(double x, double y) {
		double resultado = x + y;
		return resultado;
		
	}
	// Metodo que recebe um valor em dolares e retorna este valor em reais
	//(tomando como base o dolar do dia 14/04/2022: 4.696)
	
	public static double dolarPraReal(double dolar) {
		return dolar * 4.696;
		
	}
	//M�todo que recebe como par�mentro uma quantidade de tra�os e 
	//retorna uma string com todos esses tra�os
	public static String gerarLinha(int quantidade) {
		return gerarLinha(quantidade, '-');
		/*
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < quantidade; i++) {
			sb.append('-');
		}
		return sb.toString();*/
	}	
	
	public static String gerarLinha(int quantidade, char ch) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < quantidade; i++) {
			sb.append(ch);
		}
		return sb.toString();
	}
	
	//m�todo que recebe uma quantidade vari�vel de par�metros num�ricos (double)
	//e retorna a soma destes valores.
	
	public static double calcularSoma (double... numeros) { //Par�mentro Varargs do tipo double equivalente a double[]
		double soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		
		return soma;
	}
	
	//m�todo para gerar uma linha referente a uma exce��o
	public static void gerarLog (Object mensagem) {
		Date data = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String linha = "[ " + df.format(data) + " ] - " + mensagem;
		
		String arquivo = new SimpleDateFormat("yyyyMMdd").format(new Date()) + "_erros.log";
		
		try {
			FileWriter writer = new FileWriter(CAMINHO_ARQUIVO + arquivo, true);
			writer.write(linha + "\n");
			writer.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}