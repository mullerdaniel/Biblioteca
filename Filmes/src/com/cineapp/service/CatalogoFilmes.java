package com.cineapp.service;

import java.util.ArrayList;
import java.util.List;

import com.cineapp.model.Filme;
import com.cineapp.view.Operador;

public class CatalogoFilmes {
	
	List<Filme> listarFilmes;
	
	public CatalogoFilmes() {
		listarFilmes = new ArrayList<>();
	}
	
	
	public void gerenciarFilmes (int opcao, Operador operador) {
		
		switch(opcao) {
		
		case 1 -> {
			String titulo = operador.cadastrarTituloDoFilme();
			String genero = operador.cadastrarGeneroDoFilme();
			int duracao = operador.cadastrarDuracaoDoFilme();
			int anoLancamento = operador.cadastrarAnoDeLacamentoDoFilme();
			int quantidade = operador.cadastrarQuantidadeDeFilme();
			
			Filme filme = new Filme(titulo, genero, duracao, anoLancamento, quantidade);
			listarFilmes.add(filme);
			System.out.println("Livro cadastrado: " + filme.getTitulo());
		}
		
		case 2 -> {
			if (listarFilmes.isEmpty()) {
                System.out.println("Nenhum filme cadastrado.");
            } else {
                for (Filme filme : listarFilmes) {
                	 operador.listarLivros(filme);            
                	 }
            }
		}
		
		case 3 -> {
			 String nome = operador.removerFilme();
             boolean removido = false;

             for (int indice = 0; indice < listarFilmes.size(); indice++) {
                 if (listarFilmes.get(indice).getTitulo().equalsIgnoreCase(nome)) {
                	 listarFilmes.remove(indice);
                     removido = true;
                     break;
                 }
             }

             if (removido) {
                 operador.vizualizarFilmeRemovida(nome);
             } else {
                 operador.mensagemNaoEncontrado();
             }
		}
		
		case 4 -> {
            String tituloBusca = operador.buscarFilme();
            boolean encontrado = false;
            
            for (Filme livro : listarFilmes) {
                if(livro.getTitulo().equalsIgnoreCase(tituloBusca)) {
                    operador.exibirFilmeEncontrado(livro);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                operador.mensagemNaoEncontrado();
            }
        }
		
		case 5 -> {
		    String tituloBusca = operador.buscarFilme(); // Perguntar pelo título do filme a ser editado
		    boolean encontrado = false;
		    
		    // Procurando o filme na lista
		    for (Filme filme : listarFilmes) {
		        if(filme.getTitulo().equalsIgnoreCase(tituloBusca)) {
		            encontrado = true;
		            
		            // Caso o filme tenha sido encontrado, solicitamos os novos dados
		            String novoTitulo = operador.cadastrarTituloDoFilme();
		            String novoGenero = operador.cadastrarGeneroDoFilme();
		            int novoDuracao = operador.cadastrarDuracaoDoFilme();
		            int novoAnoLancamento = operador.cadastrarAnoDeLacamentoDoFilme();
		            
		            // Atualizando os dados do filme
		            filme.setTitulo(novoTitulo);
		            filme.setGenero(novoGenero);
		            filme.setDuracao(novoDuracao);
		            filme.setAnoLancamento(novoAnoLancamento);
		            
		            // Exibindo mensagem de confirmação
		            operador.exibirFilmeEncontrado(filme);
		            break;
		        }
		    }
		    
		    // Caso o filme não tenha sido encontrado
		    if (!encontrado) {
		        operador.mensagemNaoEncontrado();
		    }
		}
		
		case 6 -> {
		    int totalFilmesDisponiveis = 0;

		    // Somando as quantidades de todos os filmes cadastrados
		    for (Filme filme : listarFilmes) {
		        totalFilmesDisponiveis += filme.getQuantidade();
		    }

		    System.out.println("Total de filmes disponíveis na biblioteca: " + totalFilmesDisponiveis);
		}

		
		case 7 -> {
			break;
		}
			
		
		
	}
		
		
}
}

