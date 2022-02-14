package br.com.fiap.revisao.bean;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Viagem {

	private String origem;
	
	private String destino;
	
	private Calendar dataSaida;
	
	private LocalDateTime dataChegada;
	
	public Viagem() {}

	public Viagem(String origem, String destino, Calendar dataSaida, 
												LocalDateTime dataChegada) {
		this.origem = origem;
		this.destino = destino;
		this.dataSaida = dataSaida;
		this.dataChegada = dataChegada;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return "Origem : " + origem + " Destino: " + destino + 
				" Saída: " + sdf.format(dataSaida.getTime()) +
				" Chegada: " + dataChegada.format(formataData);
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Calendar getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Calendar dataSaida) {
		this.dataSaida = dataSaida;
	}

	public LocalDateTime getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(LocalDateTime dataChegada) {
		this.dataChegada = dataChegada;
	}
	
}
