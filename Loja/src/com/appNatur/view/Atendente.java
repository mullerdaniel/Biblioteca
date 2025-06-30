package com.appNatur.view;

import java.util.Scanner;
import com.appNatur.model.Suplemento;

public class Atendente {
	Scanner input = new Scanner(System.in);

	
	// MENU
	 public int menuPrincipal() {
	        System.out.println("|===================================|");
	        System.out.println("|             NaturApp              |");
	        System.out.println("|===================================|");
	        System.out.println("|1- Cadastrar Suplemento            |");
	        System.out.println("|2- Listar Suplementos              |");
	        System.out.println("|3- Remover                         |");
	        System.out.println("|4- Buscar Suplemento               |");
	        System.out.println("|5- Editar dados dos Suplementos    |");
	        System.out.println("|6- Total de Suplementos cadastrados|");
	        System.out.println("|7- Sair                            |");
	        System.out.println("|___________________________________|");

	        int opcao = input.nextInt();
	        input.nextLine(); 

	        return opcao;
	    }
	 
	 
	 	// CADASTRO NOME DOS SUPLEMENTOS
	 	public String cadastrarNomeDoSuplemento() {
	 		
	 		System.out.println ("\n<---CADASTRO DOS SUPLEMENTOS--->");
	 		System.out.println ("Nome: ");
	 		String nome = input.nextLine();		 
	 		return nome; 
	 	}
		 
		 
		 // CADASTRO DO PREÇO DOS SUPLEMENTOS
		 public double cadastrarPrecoDoSuplemento() {
		 
			 System.out.println ("Preço: ");
			 double preco = input.nextDouble();
			 return preco;
		 }
		 
		 
		 // CADASTRO DA QUANTIDADE DOS SUPLEMENTOS
		 public int cadastrarQuantidadeDoSuplemento() {
		 
			 System.out.println ("Quantidade: ");
			 int quantidade = input.nextInt();
			 input.nextLine();
			 return quantidade;
		 }
		 
		 
		 // CADASTRO DA MARCA DO SUPLEMENTO
		 public String cadastrarMarcaDoSuplemento() {
		 
		 	System.out.println ("Marca: ");
		 	String marca = input.nextLine();
		 	return marca;
		}
	 
	 
	 
	 // LISTAR TODOS OS SUPLEMENTOS CADASTRADOS
	 public void listarSuplementos(Suplemento suplemento) {
		 System.out.println ("--------------------------------");
		 System.out.println ("\nNome: "+ suplemento.getNome());
		 System.out.println ("Preço: "+ suplemento.getPreco());
		 System.out.println ("Quantidade: "+ suplemento.getQuantidade());
		 System.out.println ("Marca: "+ suplemento.getMarca());
	 }
	 
	 
	 // REMOVER SUPLEMENTO PELO NOME
	 public String removerSuplemento() {
		 System.out.println("Digite o nome do suplemento a remover:");
	     return input.nextLine(); 
	 }
	 
	 
	 // BUSCAR SUPLEMENTO PELO NOME
	 public String buscarNome() {
	        System.out.println("Digite o nome do suplemento que você deseja encontrar: ");
	        return input.nextLine();
	    }
	 
	 public void vizualizarSuplementoRemovida(String nome) {
	        System.out.println("O suplemento '" + nome + "' foi removido.");
	    }

	    public void mensagemNaoEncontrado() {
	        System.out.println("Suplemento não encontrado.");
	    }
	 
	    public void exibirLivroEncontrado(Suplemento suplemento) {
	        System.out.println("Suplemento encontrado!");
	    }
	    
	    public void exibirSuplementoEditado() {
	    	System.out.println ("Confirmado");
	    }
	 
	 // FINALIZAR O SITEMA
	 public void sistemaFinalizado() {
		 System.out.println ("Sistema Finalizado!");
	 }
	 
	 
	 
	
}
