package br.com.fiap.revisao.bean;

//4 Pilares da orientação a objetos
// Encapsulamento
// Herança
// Abstração
// Polimorfismo

// Object <- Veiculo <- Aviao

public class Aviao extends Veiculo {

	//Atributos
	private int quantidadeAssentos;
	
	private TipoAviao tipo;
	
	//Construtores
	public Aviao(String marca, String cor, int quantidadeAssentos, TipoAviao tipo) {
		super(marca, cor); //Super, invoca o construtor do pai
		this.quantidadeAssentos = quantidadeAssentos;
		this.tipo = tipo;
	}
	
	public Aviao() {
		super();
	}
	
	//Métodos
	public void decolar() {
		System.out.println("Avião decolando");
	}
	
	//Sobrecarga (overload) -> métodos com o mesmo nome, na mesma classe com parâmetros diferentes
	public void decolar(double velocidade) {
		System.out.println("Avião decolando com a velocidade " + velocidade);
	}
	
	//Sobrescrita (override) -> mesmo método do pai, na classe filha
	public void ligar() {
		System.out.println("Avião ligando...");
	}

	@Override
	public String toString() {
		return super.toString() //chama o método toString() da classe Veiculo
				+  " Qtd assentos: " + quantidadeAssentos + " Tipo: " + tipo;
	}
	
	//Getters e Setters
	public int getQuantidadeAssentos() {
		return quantidadeAssentos;
	}

	public void setQuantidadeAssentos(int quantidadeAssentos) {
		this.quantidadeAssentos = quantidadeAssentos;
	}

	public TipoAviao getTipo() {
		return tipo;
	}

	public void setTipo(TipoAviao tipo) {
		this.tipo = tipo;
	}
	
	
}