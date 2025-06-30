package com.appbiblioteca.view;

import java.util.Scanner;
import com.appbiblioteca.model.Livro;

public class Atendente {
	Scanner input = new Scanner(System.in);

	
	// MENU
	 public int menuPrincipal() {
	        System.out.println("|==============================|");
	        System.out.println("|         Biblioteca           |");
	        System.out.println("|==============================|");
	        System.out.println("|1- Cadastrar Livro            |");
	        System.out.println("|2- Listar Livros              |");
	        System.out.println("|3- Remover                    |");
	        System.out.println("|4- Buscar Livro               |");
	        System.out.println("|5- Editar dados dos Livros    |");
	        System.out.println("|6- Total de Livros cadastrados|");
	        System.out.println("|7- Sair                       |");
	        System.out.println("|______________________________|");

	        int opcao = input.nextInt();
	        input.nextLine(); 

	        return opcao;
	    }
	 
	 
	 	// CADASTRO TITULO DOS LIVROS
	 	public String cadastrarTituloDoLivro() {
	 		
	 		System.out.println ("\n<---CADASTRO DOS LIVROS--->");
	 		System.out.println ("Titulo: ");
	 		String titulo = input.nextLine();		 
	 		return titulo; 
	 	}
	 	
	 	
	 	 // CADASTRO DO AUTOR DOS LIVROS
		 public String cadastrarAutorDoLivro() {
			 
			 System.out.println ("Autor: ");
			 String autor = input.nextLine();
			 return autor;
		 }
		 
		 
		 // CADASTRO DO PREÇO DOS LIVROS
		 public double cadastrarPrecoDoLivro() {
		 
			 System.out.println ("Preço: ");
			 double preco = input.nextDouble();
			 return preco;
		 }
		 
		 
		 // CADASTRO DA QUANTIDADE DOS LIVROS
		 public int cadastrarQuantidadeDoLivro() {
		 
			 System.out.println ("Quantidade: ");
			 int quantidade = input.nextInt();
			 input.nextLine();
			 return quantidade;
		 }
		 
		 
		 // CADASTRO DA EDITORA DOS LIVROS
		 public String cadastrarEditoraDoLivro() {
		 
		 	System.out.println ("Editora: ");
		 	String editora = input.nextLine();
		 	return editora;
		}
	 
	 
	 
	 // LISTAR TODOS OS LIVROS CADASTRADOS
	 public void listarLivros(Livro livro) {
		 System.out.println ("--------------------------------");
		 System.out.println ("\nTitulo: "+ livro.getTitulo());
		 System.out.println ("Autor: "+ livro.getAutor());
		 System.out.println ("Preço: "+ livro.getPreco());
		 System.out.println ("Quantidade: "+ livro.getQuantidade());
		 System.out.println ("Editora: "+ livro.getEditora());
	 }
	 
	 
	 // REMOVER LIVRO PELO TITULO
	 public String removerLivro() {
		 System.out.println("Digite o nome do livro a remover:");
	     return input.nextLine(); 
	 }
	 
	 
	 // BUSCAR LIVRO PELO TITULO
	 public String buscarTitulo() {
	        System.out.println("Digite o titulo do livro que você deseja encoontrar: ");
	        return input.nextLine();
	    }
	 
	 public void vizualizarLivroRemovida(String nome) {
	        System.out.println("O livro '" + nome + "' foi removid.");
	    }


	    public void mensagemNaoEncontrado() {
	        System.out.println("Livro não encontrada.");
	    }
	 
	    public void exibirLivroEncontrado(Livro livro) {
	        System.out.println("livro encontrado!");
	    }
	    
	    public void exibirLivroEditado() {
	    	System.out.println ("Confirmado");
	    }
	 
	 // FINALIZAR O SITEMA
	 public void sistemaFinalizado() {
		 System.out.println ("Sistema Finalizado!");
	 }
	 
	 
	 
	
}
