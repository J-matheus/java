package javaheranca;

public class Professor extends Pessoa { 
	public Professor (String nome, String cpf, String telefone, double salario, String disciplina) {
		super(nome,cpf,telefone);
	}
	public double salario;
	public String disciplina;
}
