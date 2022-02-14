package br.com.fiap.revisao.bean;

import java.util.List;

//4 Pilares da orientação a objetos
// Encapsulamento
// Herança
// Abstração
// Polimorfismo

// Object <- Veiculo <- Aviao

//Herança ? -> É um?
//Atributo ? -> Tem um?
public class Aviao extends Veiculo {

	//Atributos
	//Valores padrões -> números primitivos=0; Referência = null; boolean=false;
	private int quantidadeAssentos;
	
	private CaixaPreta caixaPreta;
	
	private TipoAviao tipo;
	
	private List<Viagem> viagens;
	
	//Construtores
	public Aviao(String marca, String cor, int quantidadeAssentos, TipoAviao tipo) {
		super(marca, cor); //Super, invoca o construtor do pai
		this.quantidadeAssentos = quantidadeAssentos;
		this.tipo = tipo;
	}
	
	public Aviao(String marca, String cor, int quantidadeAssentos, TipoAviao tipo,
																List<Viagem> viagens ) {
		this(marca,cor,quantidadeAssentos,tipo);
		this.viagens = viagens;
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

	public CaixaPreta getCaixaPreta() {
		return caixaPreta;
	}

	public void setCaixaPreta(CaixaPreta caixaPreta) {
		this.caixaPreta = caixaPreta;
	}

	public List<Viagem> getViagens() {
		return viagens;
	}

	public void setViagens(List<Viagem> viagens) {
		this.viagens = viagens;
	}
	
	
}