package br.com.fiap.revisao.main;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteDatas {
	
	public static void main(String[] args) {
		
		//Instanciar um Calendar com a data atual
		Calendar hoje = Calendar.getInstance();
		
		//Instanciar um Calendar com a data da formatura (16/03/2023)
		Calendar colacao = new GregorianCalendar(2023, Calendar.MARCH, 16);
		
		//Formatador de data
		//MM -> mês, hh -> horas até 12, HH -> horas até 24
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//Exibir as datas
		System.out.println("Hoje: " + sdf.format(hoje.getTime()));
		System.out.println("Colação: " + sdf.format(colacao.getTime()));
		
		//API Java 8
		//Declarar uma data atual e específica
		LocalDate dataAtual = LocalDate.now();
		LocalDate nascimento = LocalDate.of(2020, 1, 14); //14/01/2020
		
		//Declarar uma hora atual e específica
		LocalTime horaAtual = LocalTime.now();
		LocalTime horaIntervalo = LocalTime.of(9, 40); //09:40
		
		//Declarar uma data e hora atuais e específica
		LocalDateTime dataAtualComHora = LocalDateTime.now();
		LocalDateTime consulta = LocalDateTime.of(2022, Month.MARCH, 15, 10, 0); //15/03/2020 10:00
		
		//Formatador de data
		DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		//Exibir as datas formatada
		System.out.println("Data atual: " + dataAtual.format(formataData));
		System.out.println("Nascimento: " + nascimento.format(formataData));
		
		DateTimeFormatter formataHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		System.out.println("Hora Atual: " + horaAtual.format(formataHora));
		System.out.println("Hora Intervalo " + horaIntervalo);

		DateTimeFormatter formataDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Data e Hora Atuais: " + dataAtualComHora.format(formataDataHora));
		System.out.println("Consulta: " + consulta.format(formataDataHora));
		
	}//main
}//class
