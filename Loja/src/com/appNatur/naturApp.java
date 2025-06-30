package com.appNatur;

import com.appNatur.view.Atendente;
import com.appNatur.service.Estoque;

public class naturApp {

    public static void main(String[] args) {

        Atendente atendente = new Atendente();
        Estoque estoque = new Estoque();
        int opcaoMenu;
        
        do {
            opcaoMenu = atendente.menuPrincipal();
            estoque.gerenciarEstoque(opcaoMenu, atendente);
        } while (opcaoMenu != 0);
        
        atendente.sistemaFinalizado();
        
    }

}
