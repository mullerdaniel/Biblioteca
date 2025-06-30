package com.cineapp.model;

public class Filme {
	
	
	private String titulo;
	private String genero;
	private int duracao;
	private int anoLancamento;
	private int quantidade;
	
	
	public Filme() {
		
		this.titulo = "";
		this.genero = "";
		this.duracao = 0;
		this.anoLancamento = 0;
		this.quantidade = 0;
		
		
	}
	
	public Filme(String titulo, String genero, int duracao, int anoLancamento, int quantidade) {
		
		this.titulo = titulo;
		this.genero = genero;
		this.duracao = duracao;
		this.anoLancamento = anoLancamento;
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

}
