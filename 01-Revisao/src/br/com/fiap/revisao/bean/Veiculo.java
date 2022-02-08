package br.com.fiap.revisao.bean;

public class Veiculo {
	
	//Modificadores de acesso:
	//private -> somente a classe
	//default/package -> a classe, classes do mesmo pacote
	//protected -> a classe, classe filha, classes do mesmo pacote
	//public -> todos
	
	//Atributos
	private String marca;
	private String cor;
	
	//Construtores -> Métodos especiais para instanciar a classe
	// 1- Não tem retorno, nem void
	// 2- Possui o mesmo nome da classe
	public Veiculo(String marca, String cor) {
		this.marca = marca;
		this.cor = cor;
	}
	
	public Veiculo() {}
	
	//Métodos
	public void ligar() {
		girarChave();
		System.out.println("Veículo ligando");
	}
	
	public void acelerar() {
		System.out.println("Veículo acelerando");
	}
	
	private void girarChave() {
		System.out.println("Girando a chave");
	}
	
	@Override
	public String toString() {
		return "Marca: " + marca + " Cor: " + cor;
	}
	
	//Getters e Setters
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}