package qintess.academiajava.aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import qintess.academiajava.classes.Aluno;
import qintess.academiajava.enumeracoes.Sexo;
import qintess.academiajava.utils.Utilitarios;

public class AppLeituraArquivo04 {
	public static void main(String[] args) {
		/*
		 * Neste programa um arquivo contendo informações de aluno, será aberto.
		 * Cada linha do arquivo contém a seguinte estrutura
		 * 
		 * 		nome;idade;sexo;matricula
		 * 
		 * Escrever um programa de forma a ler cada linha deste arquivos
		 * e usar as informações destas linhas para produzir objetos da 
		 * classe Aluno. Cada objeto deverá ser adicionado em uma lista.
		 */

		List<Aluno> alunos = new ArrayList<Aluno>();

		try {
			//Abrindo o arquivo uma linha de cada vez
			FileReader reader = new FileReader(Utilitarios.CAMINHO_ARQUIVO + "listaAlunos.csv");

			BufferedReader buffer = new BufferedReader(reader);

			while(true) {
				String linha = buffer.readLine();
				if (linha == null || linha.length() == 0) {
					break;
				}

				String[] itens = linha.split(";");
				//O método split(), quebra a String em um array de String
				//tomando como base o texto informado como parâmetro


				//usaremos cada item do array resultante como atributo para 
				//um novo objeto da classe Aluno.

				Aluno aluno = new Aluno(
						itens[0], 
						Integer.parseInt(itens[1]), 
						itens[2].equals("M") ? Sexo.MASCULINO : Sexo.FEMININO,
								Integer.parseInt(itens[3]));
				alunos.add(aluno);
			}
			buffer.close();
			reader.close();

			System.out.println("Apresentando os dados:");
			for (Aluno aluno : alunos) {
				System.out.println(aluno.mostrar());
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}