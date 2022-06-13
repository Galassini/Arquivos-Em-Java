package qintess.academiajava.aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;

import qintess.academiajava.utils.Utilitarios;

public class AppLeituraArquivo03 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader(Utilitarios.CAMINHO_ARQUIVO + "funcionarios.txt");
			BufferedReader buffer = new BufferedReader(reader);

			StringBuilder sb = new StringBuilder();
			while (true) {
				String linha = buffer.readLine();
				if (linha == null) {
					break;

				}
				sb.append(linha).append("\r\n");
			}
			buffer.close();
			reader.close();
			System.out.println(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
