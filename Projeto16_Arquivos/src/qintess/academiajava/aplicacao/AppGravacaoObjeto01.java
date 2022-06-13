package qintess.academiajava.aplicacao;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.Automovel;
import qintess.academiajava.utils.Utilitarios;

public class AppGravacaoObjeto01 {
	public static void main(String[] args) {
		try {
			/*
			 * Vamos criar uma instancia da classe Automovel
			 * e armazená-la em um arquivo			
			 */
			FileOutputStream fos = new 
					FileOutputStream(Utilitarios.CAMINHO_ARQUIVO +
							"automovel.dat");
			//.dat: Extensão muito utilizada para arquivos binários.
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			Automovel automovel = new 
					Automovel("Fiat", "Punto", 2019, "1.6");
			
			oos.writeObject(automovel);
			oos.close();
			fos.close();
			
			JOptionPane.showMessageDialog(null, "Objeto automovel armazenado.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}