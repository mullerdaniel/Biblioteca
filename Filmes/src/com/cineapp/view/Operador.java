package com.cineapp.view;

import java.util.Scanner;
import com.cineapp.model.Filme;

public class Operador {
	Scanner input = new Scanner(System.in);

	
	// MENU
	 public int menuPrincipal() {
	        System.out.println("|==============================|");
	        System.out.println("|           CineApp            |");
	        System.out.println("|==============================|");
	        System.out.println("|1- Cadastrar Filme            |");
	        System.out.println("|2- Listar Filmes              |");
	        System.out.println("|3- Remover                    |");
	        System.out.println("|4- Buscar Filme               |");
	        System.out.println("|5- Editar dados do Filme      |");
	        System.out.println("|6- Total de Filmes cadastrados|");
	        System.out.println("|7- Sair                       |");
	        System.out.println("|______________________________|");

	        int opcao = input.nextInt();
	        input.nextLine(); 

	        return opcao;
	    }
	 
	 
	 	// CADASTRO TITULO DOS FILMES
	 	public String cadastrarTituloDoFilme() {
	 		
	 		System.out.println ("\n<---CADASTRO DOS FILMES--->");
	 		System.out.println ("Titulo: ");
	 		String titulo = input.nextLine();		 
	 		return titulo; 
	 	}
	 	
	 	
	 	 // CADASTRO DO GENERO DOS FILMES
		 public String cadastrarGeneroDoFilme() {
			 
			 System.out.println ("Genero: ");
			 String genero = input.nextLine();
			 return genero;
		 }
		 
		 
		 // CADASTRO DO DURAÇÃO DO FILME
		 public int cadastrarDuracaoDoFilme() {
		 
			 System.out.println ("Duração (Em minutos): ");
			 int duracao = input.nextInt();
			 return duracao;
		 }
		 
		 
		 // CADASTRO DA ANO DE LANÇAMENTO DO FILME
		 public int cadastrarAnoDeLacamentoDoFilme() {
		 
			 System.out.println ("Ano de Lançamento: ");
			 int AnoLancamento = input.nextInt();
			 input.nextLine();
			 return AnoLancamento;
		 }
		 
		// CADASTRO DA QUANTIDADE DE FILMES
				 public int cadastrarQuantidadeDeFilme() {
				 
					 System.out.println ("Quantidade: ");
					 int quantidade = input.nextInt();
					 input.nextLine();
					 return quantidade;
				 }
	

	 
	 // LISTAR TODOS OS FILMES CADASTRADOS
	 public void listarLivros(Filme filme) {
		 System.out.println ("--------------------------------");
		 System.out.println ("\nTitulo: "+ filme.getTitulo());
		 System.out.println ("Genero: "+ filme.getGenero());
		 System.out.println ("Duração: "+ filme.getDuracao());
		 System.out.println ("Ano de lançamento: "+ filme.getAnoLancamento());
		 System.out.println ("Quantidade: "+ filme.getQuantidade());
	 }
	 
	 
	 // REMOVER FILME PELO TITULO
	 public String removerFilme() {
		 System.out.println("Digite o nome do filme a remover:");
	     return input.nextLine(); 
	 }
	 
	 
	 // BUSCAR FILME PELO TITULO
	 public String buscarFilme() {
	        System.out.println("Digite o titulo do Filme que você deseja encoontrar: ");
	        return input.nextLine();
	    }
	 
	 public void vizualizarFilmeRemovida(String titulo) {
	        System.out.println("O Filme '" + titulo + "' foi removido.");
	    }


	    public void mensagemNaoEncontrado() {
	        System.out.println("Livro não encontrada.");
	    }
	 
	    public void exibirFilmeEncontrado(Filme filme) {
	        System.out.println("Filme encontrado!");
	    }
	    
	    public void exibirFilmeEditado() {
	    	System.out.println ("Confirmado");
	    }
	 
	 // FINALIZAR O SITEMA
	 public void sistemaFinalizado() {
		 System.out.println ("Sistema Finalizado!");
	 }
	 
	 
	 
	
}
