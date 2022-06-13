package qintess.academiajava.aplicacao;

import java.io.File;
import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

import qintess.academiajava.utils.Utilitarios;

public class AppLeituraArquivo02 {
	public static void main(String[] args) {
		try {

			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
			JFileChooser chooser = new JFileChooser(); //Abre uma caixa de diálogo para selecionar arquivos
			
			//Definindo os tipos de arquivos
			//Primeiro parâmentro: o texto que irá mostra no "Arquivos do Tipo"
			//Os próximos: são as extensões
			chooser.addChoosableFileFilter(
					new FileNameExtensionFilter("Arquivos Textos (.txt/.log)", "txt", "log"));
			//definindo diretório inicial
			chooser.setCurrentDirectory(new File (Utilitarios.CAMINHO_ARQUIVO));
			
			int opcao = chooser.showOpenDialog(null); 

			if (opcao == JFileChooser.CANCEL_OPTION) {
				return;
			}

			FileReader reader = new FileReader(chooser.getSelectedFile());

			StringBuilder sb = new StringBuilder();

			while (true) {
				int ch = reader.read();
				if(ch == -1) { //EOF - End of File
					break;
				}
				sb.append((char) ch); //typeCast = converte o inteiro para caractere.
			}

			reader.close();
			System.out.println(sb.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}