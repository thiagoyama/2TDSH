package br.com.fiap.revisao.main;

import br.com.fiap.revisao.bean.Aviao;
import br.com.fiap.revisao.bean.TipoAviao;
import br.com.fiap.revisao.bean.Veiculo;

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
		
		//Instanciar um avião com todas as informações
		Aviao boeing = new Aviao("Boeing 777","Branco", 777, TipoAviao.JATO);
		
		//Exibir as informações do avião
		//Sobrecrever o método toString() nas classes Veiculo e Aviao
		System.out.println(boeing);
		
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