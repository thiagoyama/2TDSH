package br.com.fiap.main;

import br.com.fiap.bean.Aluno;
import br.com.fiap.bean.Funcionario;
import br.com.fiap.dao.OrmDao;

public class Exercicio {
	
	public static void main(String[] args) {
		//Instanciar um Aluno
		Aluno aluno = new Aluno();
		
		//Instanciar um OrmDao
		OrmDao dao = new OrmDao();
		
		//Chamar o método pequisar e exibir o SQL
		System.out.println(dao.pesquisar(aluno));
		
		//Instanciar um Funcionario
		Funcionario func = new Funcionario();
		
		//Chamar o método pesquisar e exibir o SQL
		System.out.println(dao.pesquisar(func));
		
	}
}