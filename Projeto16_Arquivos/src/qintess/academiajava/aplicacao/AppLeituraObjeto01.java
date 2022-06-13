package qintess.academiajava.aplicacao;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.Automovel;
import qintess.academiajava.utils.Utilitarios;

public class AppLeituraObjeto01 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new 
					FileInputStream(Utilitarios.CAMINHO_ARQUIVO +
							"automovel.dat");
			ObjectInputStream ois = new 
					ObjectInputStream(fis);
			
			/*
			 * Recuperando os dados do arquivo e
			 * formatando uma nova instancia
			 */
			
			Automovel a1 = (Automovel) ois.readObject();
			JOptionPane.showMessageDialog(null, a1.mostrar());
			ois.close();
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}