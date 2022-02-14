package br.com.fiap.exception;

//Exceção customizada para identificar que não é possível sacar um valor da conta
public class SaldoInsuficienteException extends Exception {

	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
	
}