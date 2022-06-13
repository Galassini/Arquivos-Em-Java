package qintess.academiajava.aplicacao;

import java.io.File;

public class AppFile {
	public static void main(String[] args) {
		try {
			File file = new File("C:/Windows/");
			
			//Vamos lista todo o conteúdo da pasta Windows.
			String[] conteudo = file.list();
			int pastas = 0, arquivos = 0;
			
			for (String item: conteudo) {
				File fileItem = new File("C:/Windows/" + item);
				if (fileItem.isDirectory()) {
					System.out.println("[pasta] " + item);
					pastas++;
				} else {
					String extensao = item.substring(item.lastIndexOf('.'));
					System.out.println("[arquivo] " + item + " extensão: " + extensao);
					arquivos++;
				}
				//System.out.println(fileItem.isDirectory() ? "[pasta] " + item : "[arquivo] " + item);
			}
			System.out.println("Total de pastas: " + pastas);
			System.out.println("Total de arquivos: " + arquivos);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}