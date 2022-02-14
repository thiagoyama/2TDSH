package br.com.fiap.revisao.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.fiap.revisao.bean.Aviao;
import br.com.fiap.revisao.bean.TipoAviao;

public class TesteCollections {

	public static void main(String[] args) {
		//Criar uma lista de Aviões
		List<Aviao> lista = new ArrayList<>();
		
		//Adicionar dois aviões na lista
		Aviao jato = new Aviao("Embraer", "Branco", 12, TipoAviao.JATO);
		lista.add(jato);
		lista.add(jato);
		
		//Instancia um Aviao e adiciona na lista
		lista.add(new Aviao("Airbus", "Azul", 350, TipoAviao.TURBOELICE));
		
		//Exibir os aviões da lista
		System.out.println("For");
		for (int i=0; i < lista.size() ; i++) {
			System.out.println(lista.get(i)); //recupera o aviao da lista pela posição
		}
		
		System.out.println("Foreach");
		for (Aviao item : lista) {
			System.out.println(item);
		}
		
		//Criar um conjunto (Set) de aviões
		Set<Aviao> conjunto = new HashSet<Aviao>();
		
		//Adicionar 3 aviões no set, sendo 1 repetido
		conjunto.add(jato);
		conjunto.add(jato);
		conjunto.add(new Aviao("Boeing", "Amarelo", 400, TipoAviao.JATO));
		
		//Exibir os aviões do set
		System.out.println("Conjunto");
		for (Aviao item : conjunto) {
			System.out.println(item);
		}
		
		//Criar um Mapa com Chave do tipo String e o Valor do tipo Avião
		Map<String,Aviao> mapa = new HashMap<String, Aviao>();
		
		//Adicionar 2 aviões ao mapa (Chave com o nome qualquer)
		mapa.put("Anita", jato);
		mapa.put("Ivete", new Aviao("Embraer", "Rosa", 20, TipoAviao.JATO));
		
		//Recuperar o avião pela chave
		System.out.println("Mapa:");
		System.out.println(mapa.get("Anita"));

		//Recuperar todas as chaves do mapa
		Set<String> chaves = mapa.keySet();
		
	}//main
}//class