package com.appbiblioteca.service;

import java.util.ArrayList;
import java.util.List;

import com.appbiblioteca.model.Livro;
import com.appbiblioteca.view.Atendente;

public class Biblioteca {
	
	List<Livro> listarLivros;
	
	public Biblioteca() {
		listarLivros = new ArrayList<>();
	}
	
	
	public void gerenciarBiblioteca (int opcao, Atendente atendente) {
		
		switch(opcao) {
		
		case 1 -> {
			String titulo = atendente.cadastrarTituloDoLivro();
			String autor = atendente.cadastrarAutorDoLivro();
			double preco = atendente.cadastrarPrecoDoLivro();
			int quantidade = atendente.cadastrarQuantidadeDoLivro();
			String editora = atendente.cadastrarEditoraDoLivro();
			
			Livro livro = new Livro(titulo, autor, preco, quantidade, editora);
			listarLivros.add(livro);
			System.out.println("Livro cadastrado: " + livro.getTitulo());
		}
		
		case 2 -> {
			if (listarLivros.isEmpty()) {
                System.out.println("Nenhuma fruta cadastrada.");
            } else {
                for (Livro livro : listarLivros) {
                    atendente.listarLivros(livro);  
                }
            }
		}
		
		case 3 -> {
			 String nome = atendente.removerLivro();
             boolean removido = false;

             for (int indice = 0; indice < listarLivros.size(); indice++) {
                 if (listarLivros.get(indice).getTitulo().equalsIgnoreCase(nome)) {
                	 listarLivros.remove(indice);
                     removido = true;
                     break;
                 }
             }

             if (removido) {
                 atendente.vizualizarLivroRemovida(nome);
             } else {
                 atendente.mensagemNaoEncontrado();
             }
		}
		
		case 4 -> {
            String tituloBusca = atendente.buscarTitulo();
            boolean encontrado = false;
            
            for (Livro livro : listarLivros) {
                if(livro.getTitulo().equalsIgnoreCase(tituloBusca)) {
                    atendente.exibirLivroEncontrado(livro);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                atendente.mensagemNaoEncontrado();
            }
        }
		
		case 5 -> {
		    String tituloBusca = atendente.buscarTitulo(); // Perguntar pelo título do livro a ser editado
		    boolean encontrado = false;
		    
		    // Procurando o livro na lista
		    for (Livro livro : listarLivros) {
		        if(livro.getTitulo().equalsIgnoreCase(tituloBusca)) {
		            encontrado = true;
		            
		            // Caso o livro tenha sido encontrado, solicitamos os novos dados
		            String novoTitulo = atendente.cadastrarTituloDoLivro();
		            String novoAutor = atendente.cadastrarAutorDoLivro();
		            double novoPreco = atendente.cadastrarPrecoDoLivro();
		            int novaQuantidade = atendente.cadastrarQuantidadeDoLivro();
		            String novaEditora = atendente.cadastrarEditoraDoLivro();
		            
		            // Atualizando os dados do livro
		            livro.setTitulo(novoTitulo);
		            livro.setAutor(novoAutor);
		            livro.setPreco(novoPreco);
		            livro.setQuantidade(novaQuantidade);
		            livro.setEditora(novaEditora);
		            
		            // Exibindo mensagem de confirmação
		            atendente.exibirLivroEncontrado(livro);
		            break;
		        }
		    }
		    
		    // Caso o livro não tenha sido encontrado
		    if (!encontrado) {
		        atendente.mensagemNaoEncontrado();
		    }
		}
		
		case 6 -> {
		    int totalLivrosDisponiveis = 0;

		    // Somando as quantidades de todos os livros cadastrados
		    for (Livro livro : listarLivros) {
		        totalLivrosDisponiveis += livro.getQuantidade();
		    }

		    System.out.println("Total de livros disponíveis na biblioteca: " + totalLivrosDisponiveis);
		}

		
		case 7 -> {
			break;
		}
			
		
		
	}
		
		
}
}

