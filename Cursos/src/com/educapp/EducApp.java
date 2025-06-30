package com.educapp;

import com.educapp.view.Secretaria;
import com.educapp.service.GerenciadorCursos;

public class EducApp {

    public static void main(String[] args) {

    	Secretaria secretaria = new Secretaria();
        GerenciadorCursos gerenciadorcursos = new GerenciadorCursos();
        int opcaoMenu;
        
        do {
            opcaoMenu = secretaria.menuPrincipal();
            gerenciadorcursos.gerenciarBiblioteca(opcaoMenu, secretaria);
        } while (opcaoMenu != 0);
        
        secretaria.sistemaFinalizado();
        
    }

}
