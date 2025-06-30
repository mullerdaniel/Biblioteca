package com.educapp.service;

import java.util.ArrayList;
import java.util.List;

import com.educapp.model.Curso;
import com.educapp.view.Secretaria;

public class GerenciadorCursos {
	
	int i = 0;
	
	List<Curso> listarCursos;
	
	public GerenciadorCursos() {
		listarCursos = new ArrayList<>();
	}
	
	
	public void gerenciarBiblioteca (int opcao, Secretaria secretaria) {
		
		switch(opcao) {
		
		case 1 -> {
			i++;
			String nome = secretaria.cadastrarNomeDoCurso();
			int duracaoHoras = secretaria.cadastrarDuracaoDoCurso();
			String nivel = secretaria.cadastrarNivelDoCurso();
			int vagas = secretaria.cadastrarVagasDoLivro();
			
			Curso curso = new Curso(nome, duracaoHoras, nivel, vagas);
			listarCursos.add(curso);
			System.out.println("Livro cadastrado: " + curso.getNome());
		}
		
		case 2 -> {
			if (listarCursos.isEmpty()) {
                System.out.println("Nenhuma fruta cadastrada.");
            } else {
                for (Curso curso : listarCursos) {
                	secretaria.listarLivros(curso);  
                }
            }
		}
		
		case 3 -> {
			 String nome = secretaria.removerCurso();
             boolean removido = false;

             for (int indice = 0; indice < listarCursos.size(); indice++) {
                 if (listarCursos.get(indice).getNome().equalsIgnoreCase(nome)) {
                	 listarCursos.remove(indice);
                     removido = true;
                     break;
                 }
             }

             if (removido) {
            	 secretaria.vizualizarCursoRemovida(nome);
             } else {
            	 secretaria.mensagemNaoEncontrado();
             }
		}
		
		case 4 -> {
            String tituloBusca = secretaria.buscarTitulo();
            boolean encontrado = false;
            
            for (Curso curso : listarCursos) {
                if(curso.getNome().equalsIgnoreCase(tituloBusca)) {
                	secretaria.exibirCursoEncontrado(curso);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
            	secretaria.mensagemNaoEncontrado();
            }
        }
		
		case 5 -> {
		    String tituloBusca = secretaria.buscarTitulo(); // Perguntar pelo nome do curso a ser editado
		    boolean encontrado = false;
		    
		    // Procurando o curso na lista
		    for (Curso curso : listarCursos) {
		        if(curso.getNome().equalsIgnoreCase(tituloBusca)) {
		            encontrado = true;
		            
		            // Caso o curso tenha sido encontrado, solicitamos os novos dados
		            String novoNome = secretaria.cadastrarNomeDoCurso();
		            int novaDuracaoHoras = secretaria.cadastrarDuracaoDoCurso();
		            String novoNivel = secretaria.cadastrarNivelDoCurso();
		            int novaVagas = secretaria.cadastrarVagasDoLivro();
		            
		            // Atualizando os dados do curso
		            curso.setNome(novoNome);
		            curso.setDuracaoHoras(novaDuracaoHoras);
		            curso.setNivel(novoNivel);
		            curso.setVagas(novaVagas);
		            
		            // Exibindo mensagem de confirmação
		            secretaria.exibirCursoEncontrado(curso);
		            break;
		        }
		    }
		    
		    // Caso o curso não tenha sido encontrado
		    if (!encontrado) {
		    	secretaria.mensagemNaoEncontrado();
		    }
		}
		
		case 6 -> {
		    int totalLivrosDisponiveis = 0;

		    // Somando as quantidades de todos os cursos cadastrados
		    System.out.println("Total de Cursos disponíveis na biblioteca: " + i);
		}

		
		case 7 -> {
			break;
		}
			
		
		
	}
		
		
}
}

