package com.appNatur.service;

import java.util.ArrayList;
import java.util.List;

import com.appNatur.model.Suplemento;
import com.appNatur.view.Atendente;

public class Estoque {
	
	List<Suplemento> listarSuplementos;
	
	public Estoque() {
		listarSuplementos = new ArrayList<>();
	}
	
	
	public void gerenciarEstoque (int opcao, Atendente atendente) {
		
		switch(opcao) {
		
		case 1 -> {
			String nome = atendente.cadastrarNomeDoSuplemento();
			double preco = atendente.cadastrarPrecoDoSuplemento();
			int quantidade = atendente.cadastrarQuantidadeDoSuplemento();
			String marca = atendente.cadastrarMarcaDoSuplemento();
			
			Suplemento suplemento = new Suplemento(nome, preco, quantidade, marca);
			listarSuplementos.add(suplemento);
			System.out.println("Suplemento cadastrado: " + suplemento.getNome());
		}
		
		case 2 -> {
			if (listarSuplementos.isEmpty()) {
                System.out.println("Nenhum suplemento cadastrada.");
            } else {
                for (Suplemento suplemento : listarSuplementos) {
                    atendente.listarSuplementos(suplemento);  
                }
            }
		}
		
		case 3 -> {
			 String nome = atendente.removerSuplemento();
             boolean removido = false;

             for (int indice = 0; indice < listarSuplementos.size(); indice++) {
                 if (listarSuplementos.get(indice).getNome().equalsIgnoreCase(nome)) {
                	 listarSuplementos.remove(indice);
                     removido = true;
                     break;
                 }
             }

             if (removido) {
                 atendente.vizualizarSuplementoRemovida(nome);
             } else {
                 atendente.mensagemNaoEncontrado();
             }
		}
		
		case 4 -> {
            String tituloBusca = atendente.buscarNome();
            boolean encontrado = false;
            
            for (Suplemento suplemento : listarSuplementos) {
                if(suplemento.getNome().equalsIgnoreCase(tituloBusca)) {
                    atendente.exibirLivroEncontrado(suplemento);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                atendente.mensagemNaoEncontrado();
            }
        }
		
		case 5 -> {
		    String tituloBusca = atendente.buscarNome(); // Perguntar pelo nome do suplemento a ser editado
		    boolean encontrado = false;
		    
		    // Procurando o suplemento na lista
		    for (Suplemento suplemento : listarSuplementos) {
		        if(suplemento.getNome().equalsIgnoreCase(tituloBusca)) {
		            encontrado = true;
		            
		            // Caso o Suplemento tenha sido encontrado, solicitamos os novos dados
		            String novoNome = atendente.cadastrarNomeDoSuplemento();
		            double novoPreco = atendente.cadastrarPrecoDoSuplemento();
		            int novaQuantidade = atendente.cadastrarQuantidadeDoSuplemento();
		            String novaMarca = atendente.cadastrarMarcaDoSuplemento();
		            
		            // Atualizando os dados do suplementos
		            suplemento.setNome(novoNome);
		            suplemento.setPreco(novoPreco);
		            suplemento.setQuantidade(novaQuantidade);
		            suplemento.setMarca(novaMarca);
		            
		            // Exibindo mensagem de confirmação
		            atendente.exibirLivroEncontrado(suplemento);
		            break;
		        }
		    }
		    
		    // Caso o suplemento não tenha sido encontrado
		    if (!encontrado) {
		        atendente.mensagemNaoEncontrado();
		    }
		}
		
		case 6 -> {
		    int totalSuplementosDisponiveis = 0;

		    // Somando as quantidades de todos os livros cadastrados
		    for (Suplemento suplementos : listarSuplementos) {
		    	totalSuplementosDisponiveis += suplementos.getQuantidade();
		    }

		    System.out.println("Total de suplementos disponíveis no estoque: " + totalSuplementosDisponiveis);
		}

		
		case 7 -> {
			break;
		}
			
		
		
	}
		
		
}
}

