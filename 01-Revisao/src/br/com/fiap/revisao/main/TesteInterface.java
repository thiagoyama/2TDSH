package br.com.fiap.revisao.main;

import br.com.fiap.revisao.bean.Veiculo;
import br.com.fiap.revisao.dao.VeiculoDao;
import br.com.fiap.revisao.dao.VeiculoMySqlDao;

public class TesteInterface {
	
	public static void main(String[] args) {
		
		//Declarar uma variável do tipo da interface 
		//e instanciar uma classe que implementa a interface
		VeiculoDao dao = new VeiculoMySqlDao();
		
		//Chamar os métodos...
		dao.cadastrar(new Veiculo());
		dao.listar();
		
	}
}