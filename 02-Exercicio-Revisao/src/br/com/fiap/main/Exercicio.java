package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.bean.TipoConta;
import br.com.fiap.exception.SaldoInsuficienteException;

public class Exercicio {

	public static void main(String[] args) {
		//Instanciar uma conta corrente
		ContaCorrente cc = new ContaCorrente(123, 321, 
				new GregorianCalendar(2020, Calendar.JANUARY, 10), 0, TipoConta.COMUM);
		
		//Instanciar uma conta poupança
		ContaPoupanca cp = new ContaPoupanca(143,321, Calendar.getInstance(), 0, 1);
		
		//Chamar o método depositar
		cc.depositar(100);
		System.out.println("Saldo conta corrente: " + cc.getSaldo());
		cp.depositar(100);
		System.out.println("Saldo conta poupança: " + cp.getSaldo());
		System.out.println("Depósito realizado!");
		
		//Chamar o método retirar
		try {
			cc.retirar(100);
			System.out.println("Saldo conta corrente: " + cc.getSaldo());
			cp.retirar(100);
			System.out.println("Saldo conta poupança: " + cp.getSaldo());
			System.out.println("Retirada efetuada!");
		} catch (SaldoInsuficienteException e) {
			System.err.println(e.getMessage());
		}
		
		//Criar uma lista de conta corrente
		List<ContaCorrente> lista = new ArrayList<>();
		
		//Adicionar 3 contas
		lista.add(cc);
		lista.add(new ContaCorrente(423,123, new GregorianCalendar(2010, Calendar.APRIL, 4), 999, TipoConta.COMUM));
		lista.add(new ContaCorrente(234,235, new GregorianCalendar(2015, Calendar.DECEMBER, 18), 772, TipoConta.ESPECIAL));
		
		//Exibir o saldo das contas
		for (ContaCorrente item : lista) {
			System.out.println("Saldo: " + item.getSaldo());
		}
		
	}//main
}//class