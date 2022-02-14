package br.com.fiap.revisao.main;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.revisao.bean.Aviao;
import br.com.fiap.revisao.bean.TipoAviao;
import br.com.fiap.revisao.bean.Veiculo;
import br.com.fiap.revisao.bean.Viagem;

public class Teste {
	
	public static void main(String[] args) {
		//Instanciar a classe Veiculo
		Veiculo veiculo = new Veiculo();
		
		//Setar o valor da marca e cor
		veiculo.setMarca("Honda");
		veiculo.setCor("Azul");
		
		//Chamar os métodos
		veiculo.ligar();
		veiculo.acelerar();
		
		//Criar uma lista de viagens com 2 ou 3 viagens
		List<Viagem> viagens = new ArrayList<>();
		
		viagens.add(new Viagem("São Paulo", "Salvador", 
				new GregorianCalendar(2022, Calendar.JANUARY, 15, 7, 0),
				LocalDateTime.of(2022, 1, 15, 12, 0)));
		
		viagens.add(new Viagem("Rio de Janeiro", "Paris", 
				new GregorianCalendar(2022, Calendar.APRIL, 20, 10, 0),
				LocalDateTime.of(2022,4, 21, 1,0)));
		
		//Setar a lista de viagens do avião no Objeto
		//Instanciar um avião com todas as informações
		Aviao boeing = new Aviao("Boeing 777","Branco", 777, TipoAviao.JATO, viagens);
		
		//Exibir as informações do avião
		//Sobrecrever o método toString() nas classes Veiculo e Aviao
		System.out.println(boeing);
		
		//Exibir as viagens do avião
		System.out.println("Viagens:");
		for (Viagem item : boeing.getViagens()) {
			System.out.println(item);
		}
		
		//Chamar o método decolar e ligar
		boeing.decolar();
		boeing.ligar();
		
		//Validar se o avião é TECO_TECO:
		if (boeing.getTipo() == TipoAviao.TECO_TECO) {
			System.out.println("Avião do tipo Teco Teco");
		} else {
			System.out.println("Avião de outro tipo");
		}
		
	}//main
}//class