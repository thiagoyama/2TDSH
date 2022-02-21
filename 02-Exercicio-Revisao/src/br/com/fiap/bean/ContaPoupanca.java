package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.exception.SaldoInsuficienteException;

public class ContaPoupanca extends Conta implements ContaInvestimento {

	//Atributos
	private float taxa;
	
	//Constante
	public static final float RENDIMENTO = 0.05f;
	
	//Construtores
	public ContaPoupanca() {}
	
	public ContaPoupanca(int numero, int agencia, Calendar dataAbertura, double saldo,
																				float taxa) {
		super(numero, agencia, dataAbertura, saldo);
		this.taxa = taxa;
	}
	
	//Métodos
	@Override
	public double calculaRetornoInvestimento() {
		return saldo * RENDIMENTO;
	}

	@Override
	public void retirar(double valor) throws SaldoInsuficienteException {
		//Verifica se o saldo é suficiente, retira junto com a taxa
		if (valor + taxa > saldo) {
			throw new SaldoInsuficienteException("Saldo insuficiente, valor permitido: " + (saldo - taxa));
		}
		saldo -= valor + taxa;
	}

	//Getters e Setters
	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

}
