package qintess.academiajava.aplicacao;

import java.io.FileWriter;

import javax.swing.JOptionPane;

import qintess.academiajava.utils.Utilitarios;

public class AppGravacaoArquivo01 {
	public static void main(String[] args) {
		try {
			
			//Gerando um arquivo com o texto fornecido pelo usuario;
			FileWriter writer = new FileWriter( Utilitarios.CAMINHO_ARQUIVO + "arquivo1.txt", true);
			
			// o nome informado sera adicionado no arquivo
			String nome =JOptionPane.showInputDialog("Informe o seu nome: ");
			
			writer.write(nome + '\n');
			writer.close();
			JOptionPane.showMessageDialog(null, " Arquivo criado com sucesso. ");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
