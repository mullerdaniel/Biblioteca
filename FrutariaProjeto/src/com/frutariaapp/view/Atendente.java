package com.frutariaapp.view;

import java.util.Scanner;
import com.frutariaapp.model.Fruta;

public class Atendente {

    private Scanner input;

    public Atendente() {
        input = new Scanner(System.in);
    }

    public int menuPrincipal() {
        System.out.println("|=============================|");
        System.out.println("|          Frutaria           |");
        System.out.println("|=============================|");
        System.out.println("|1- Cadastrar Fruta           |");
        System.out.println("|2- Listar Frutas             |");
        System.out.println("|3- Remover                   |");
        System.out.println("|0- Sair                      |");
        System.out.println("|_____________________________|");

        int opcao = input.nextInt();
        input.nextLine(); 

        return opcao;
    }

    public String cadastrarNome() {
        System.out.println("\n<--Cadastrar Frutas-->\n");
        System.out.println("Nome: ");
        String nome = input.nextLine();  
        return nome;
    }

    public double cadastrarPreco() {
        System.out.println("Preço: ");
        double preco = input.nextDouble();
        input.nextLine();  
        return preco;
    }

    public int cadastrarQuantidade() {
        System.out.println("Quantidade: ");
        int quantidade = input.nextInt();
        input.nextLine(); 
        return quantidade;
    }

    public void listar(Fruta fruta) {
        System.out.println("----------------------");
        System.out.println("Nome: " + fruta.getNome());
        System.out.println("Preço: R$" + fruta.getPreco());
        System.out.println("Quantidade: " + fruta.getQuantidade());
    }


    public String removerFruta() {
        System.out.println("Digite o nome da fruta a remover:");
        return input.nextLine();
    }


    public void vizualizarFrutaRemovida(String nome) {
        System.out.println("A fruta '" + nome + "' foi removida.");
    }


    public void mensagemNaoEncontrado() {
        System.out.println("Fruta não encontrada.");
    }


    public void finalizarApp() {
        System.out.println("Sistema encerrado.");
    }


    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }
}
