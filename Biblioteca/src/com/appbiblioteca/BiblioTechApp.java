package com.appbiblioteca;

import com.appbiblioteca.view.Atendente;
import com.appbiblioteca.service.Biblioteca;

public class BiblioTechApp {

    public static void main(String[] args) {

        Atendente atendente = new Atendente();
        Biblioteca biblioteca = new Biblioteca();
        int opcaoMenu;
        
        do {
            opcaoMenu = atendente.menuPrincipal();
            biblioteca.gerenciarBiblioteca(opcaoMenu, atendente);
        } while (opcaoMenu != 0);
        
        atendente.sistemaFinalizado();
        
    }

}
