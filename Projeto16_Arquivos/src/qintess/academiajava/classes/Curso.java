package qintess.academiajava.classes;

import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Random;

public class Curso implements Comparable<Curso> {
	private final int codigo;
	private String descricao;
	private Integer ch;
	private Double preco;

	public Curso(String descricao, int ch, double preco) 
			throws IllegalAccessException, InstantiationException {

		Random random = new Random();
		this.codigo = random.nextInt(899) + 100; 
		this.setDescricao(descricao);
		this.setCh(ch);
		this.setPreco(preco);

	}
	public int getCodigo() {
		return codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		if(descricao == null || descricao.trim().equals("")) {
			throw new NullPointerException("A descrição deve ter um conteúdo válido!");
		}
		this.descricao = descricao;
	}
	public Integer getCh() {
		return ch;
	}
	public void setCh(int ch) throws IllegalAccessException {
		if(ch <= 0) {
			throw new IllegalAccessException("A carga horária deve ser positiva.");
		}
		this.ch = ch;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(double preco) throws InstantiationException {
		if (preco < 0) {
			throw new InstantiationException("Preço não pode ser negativo.");
		}
		this.preco = preco;
	}

	public String mostrar() {
		StringBuilder sb = new StringBuilder();
		sb.append("Código: ").append(this.getCodigo())
		.append("\nDescrição: ").append(this.getDescricao())
		.append("\nCarga Horária: ").append(this.getCh())
		.append("\nPreço: ").append(this.getPreco());
		
		/*String resultado = "Código: " + this.getCodigo() +
				"\nDescrição: " + this.getDescricao() +
				"\nCarga Horária: " + this.getCh() +
				"\nPreço: " + this.getPreco();
		return resultado;
		*/
		return sb.toString();
	}
	@Override
	public int compareTo(Curso o) {
		return this.getDescricao().compareTo(o.getDescricao());
	}
	@Override
	public int hashCode() {
		return this.getDescricao().toLowerCase().hashCode() + 
				this.getCh().hashCode() + 
				this.getPreco().hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Curso) { //VERIFICA SE O OBJETO É UMA INSTÂNCIA DE CURSO
			Curso curso = (Curso) obj;
			if(this.getDescricao().equalsIgnoreCase(curso.getDescricao()) 
					&&	this.getCh().equals(curso.getCh()) 
					&& this.getPreco().equals(curso.getPreco())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		Formatter fmt = new Formatter();
		DecimalFormat df = new DecimalFormat(",##0.00");
		String resposta = fmt.format(
				"%-6d %-30s %-3d %12s%n", 
				this.getCodigo(), 
				this.getDescricao(), 
				this.getCh(), 
				df.format(this.getPreco())).toString();
		fmt.close();
		return resposta;
	}
	
}