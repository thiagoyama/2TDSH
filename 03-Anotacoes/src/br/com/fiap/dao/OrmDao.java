package br.com.fiap.dao;

import br.com.fiap.anotacao.Tabela;

public class OrmDao {

	/**
	 * Recebe um objeto, recupera a anotação @Tabela do objeto para retornar um SQL
	 * @param obj
	 * @return Select na tabela configurada no objeto
	 */
	public String pesquisar(Object obj) {
		//Recuperar a anotação @Tabela do objeto
		Tabela anotacao = obj.getClass().getAnnotation(Tabela.class);
		
		//Recuperar o nome definido na anotação
		String tabela = anotacao.nome();
		
		//Retornar o select
		return "select * from " + tabela;
	}
	
}