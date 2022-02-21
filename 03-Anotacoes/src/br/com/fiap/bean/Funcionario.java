package br.com.fiap.bean;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.anotacao.Tabela;

@Tabela(nome="TB_FUNCIONARIO")
public class Funcionario {

	//Atributos
	@Coluna(nome="cd_funcionario", chave=true)
	private int codigo;
	
	@Coluna(nome="nm_funcionario", tamanho=100)
	private String nome;
	
	@Coluna(nome="vl_salario")
	private double salario;
	
	//Métodos
	public void aumentarSalario() {
		salario += 100;
	}
	
	//Getters e Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}