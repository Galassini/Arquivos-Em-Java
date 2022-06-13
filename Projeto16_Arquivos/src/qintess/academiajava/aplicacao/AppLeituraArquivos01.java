package qintess.academiajava.aplicacao;

import java.io.FileReader;

import qintess.academiajava.utils.Utilitarios;

public class AppLeituraArquivos01 {
	public static void main(String[] args) {
		
		try {
			
			
			//Lendo arquivo texto
			// forma 1: por caracteres
			
			FileReader reader = new
					FileReader(Utilitarios.CAMINHO_ARQUIVO + "Funcionarios.txt");
			
			StringBuilder sb = new StringBuilder();
			while(true){
				int ch = reader.read();
				if(ch == -1) { //EOF = End Of File
					break;
				}
				sb.append((char)ch);
			}
			
			reader.close();
			System.out.println(sb.toString());
			
		} catch (Exception e) {
			
		}
	}

}
