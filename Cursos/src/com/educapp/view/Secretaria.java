package com.educapp.view;

import java.util.Scanner;
import com.educapp.model.Curso;

public class Secretaria {
	Scanner input = new Scanner(System.in);

	
	// MENU
	 public int menuPrincipal() {
	        System.out.println("|==============================|");
	        System.out.println("|           EducApp            |");
	        System.out.println("|==============================|");
	        System.out.println("|1- Cadastrar Curso            |");
	        System.out.println("|2- Listar Cursos              |");
	        System.out.println("|3- Remover                    |");
	        System.out.println("|4- Buscar Curso               |");
	        System.out.println("|5- Editar dados dos Cursos    |");
	        System.out.println("|6- Total de Cursos cadastrados|");
	        System.out.println("|7- Sair                       |");
	        System.out.println("|______________________________|");

	        int opcao = input.nextInt();
	        input.nextLine(); 

	        return opcao;
	    }
	 
	 
	 	// CADASTRO NOME DOS CURSOS
	 	public String cadastrarNomeDoCurso() {
	 		
	 		System.out.println ("\n<---CADASTRO DOS CURSO--->");
	 		System.out.println ("Nome: ");
	 		String nome = input.nextLine();	
	 		return nome; 
	 	}
	 	
	 	
	 	 // CADASTRO DO DURAÇÃO DE HORAS DOS CURSOS
		 public int cadastrarDuracaoDoCurso() {
			 
			 System.out.println ("Duração do Curso (Em horas): ");
			 int duracaoHoras = input.nextInt();
			 return duracaoHoras;
		 }
		 
		 
		 // CADASTRO DO NIVEL DOS CURSOS
		 public String cadastrarNivelDoCurso() {
		 
			 System.out.println ("Nivel: ");
			 String nivel = input.next();
			 return nivel;
		 }
		 
		 
		 // CADASTRO DA VAGAS DOS CURSOS
		 public int cadastrarVagasDoLivro() {
		 
			 System.out.println ("Quantidade de Vagas: ");
			 int Vagas = input.nextInt();
			 input.nextLine();
			 return Vagas;
		 }
		 
		 
		 
	 // LISTAR TODOS OS CURSOS CADASTRADOS
	 public void listarLivros(Curso curso) {
		 System.out.println ("--------------------------------");
		 System.out.println ("\nNome: "+ curso.getNome());
		 System.out.println ("Duração (Em horas): "+ curso.getDuracaoHoras());
		 System.out.println ("Nivel: "+ curso.getNivel());
		 System.out.println ("Vagas: "+ curso.getVagas());
	 }
	 
	 
	 // REMOVER CURSOS PELO TITULO
	 public String removerCurso() {
		 System.out.println("Digite o nome do Curso a remover:");
	     return input.nextLine(); 
	 }
	 
	 
	 // BUSCAR Curso PELO TITULO
	 public String buscarTitulo() {
	        System.out.println("Digite o Curso do livro que você deseja encoontrar: ");
	        return input.nextLine();
	    }
	 
	 public void vizualizarCursoRemovida(String nome) {
	        System.out.println("O Curso '" + nome + "' foi removido.");
	    }


	    public void mensagemNaoEncontrado() {
	        System.out.println("Curso não encontrada.");
	    }
	 
	    public void exibirCursoEncontrado(Curso curso) {
	        System.out.println("Curso encontrado!");
	    }
	    
	    public void exibirCursoEditado() {
	    	System.out.println ("Confirmado");
	    }
	 
	 // FINALIZAR O SITEMA
	 public void sistemaFinalizado() {
		 System.out.println ("Sistema Finalizado!");
	 }
	 
	 
	 
	
}
