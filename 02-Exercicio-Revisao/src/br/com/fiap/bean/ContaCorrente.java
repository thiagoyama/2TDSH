package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta {

	//Atributos
	private TipoConta tipo;
	
	//Construtores
	public ContaCorrente() {}
	
	public ContaCorrente(int numero, int agencia, Calendar dataAbertura, 
													double saldo, TipoConta tipo) {
		super(numero, agencia, dataAbertura, saldo);
		this.tipo = tipo;
	}
	
	//Métodos
	@Override
	public void depositar(double valor) {
		saldo += valor; //saldo = saldo + valor;
	}

	@Override
	public void retirar(double valor) throws SaldoInsuficienteException {
		//Validar se a conta é comum e o saldo fica negativo depois do saque
		if (tipo == TipoConta.COMUM && valor > saldo) {
			//Lançar uma exception
			throw new SaldoInsuficienteException("Saldo insuficiente, limite máximo: " + saldo);
		}
		saldo -= valor; 
	}

	//Getters e Setters
	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}
	
}
