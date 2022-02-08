package br.com.fiap.revisao.dao;

import java.util.List;
import br.com.fiap.revisao.bean.Veiculo;

//Interface é um contrato, define os métodos que as classes devem implementar
public interface VeiculoDao {

	void cadastrar(Veiculo veiculo);
	
	List<Veiculo> listar();
	
}