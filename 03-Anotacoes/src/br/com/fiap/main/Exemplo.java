package br.com.fiap.main;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.bean.Funcionario;

public class Exemplo {

	public static void main(String[] args) {
		
		//Instanciar um Funcionario
		Funcionario f = new Funcionario();
		
		//Exibir o nome da classe
		System.out.println(f.getClass().getName());
		
		//Recuperar os atributos do objeto funcionário
		Field[] atributos = f.getClass().getDeclaredFields();
		
		System.out.println("**Atributos:");
		for (Field item : atributos) {
			//Exibir o tipo e os nomes dos atributos
			System.out.println("\nAtributo : " + item.getType() + " " + item.getName());
			//Recuperar a anotação @Coluna
			Coluna anotacao = item.getAnnotation(Coluna.class);
			//Exibir os parâmetros da anotação @Coluna
			System.out.println("Nome da coluna: " + anotacao.nome());
			System.out.println("Chave: " + anotacao.chave());
			System.out.println("Tamanho: " + anotacao.tamanho());
		}
		
		//Recuperar os métodos do objeto funcionário
		Method[] metodos = f.getClass().getDeclaredMethods();
		
		//Exibir os nomes dos métodos
		System.out.println("\n**Métodos:");
		for (Method item : metodos) {
			System.out.println(item.getName());
		}
		
	}//main
}//class