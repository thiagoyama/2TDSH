package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Retention -> Define até quando a anotação será mantida (Código, Compilação, Execução)
@Retention(RetentionPolicy.RUNTIME) //Até a execução

//Target -> Define o lugar onde a anotação pode ser utilizada
//Permite a utilização da anotação em atributos e métodos
@Target({ ElementType.FIELD, ElementType.METHOD })
public @interface Coluna {

	String nome();
	boolean chave() default false;
	int tamanho() default 0; //valor padrão, o parâmetro não é obrigatório
	
}