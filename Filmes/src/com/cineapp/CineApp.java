package com.cineapp;

import com.cineapp.view.Operador;
import com.cineapp.service.CatalogoFilmes;

public class CineApp {

    public static void main(String[] args) {

    	  Operador operador = new Operador(); 
          CatalogoFilmes catalogofilmes = new CatalogoFilmes();
          int opcaoMenu;
          
          do {
              opcaoMenu = operador.menuPrincipal();
             
              catalogofilmes.gerenciarFilmes(opcaoMenu, operador); 
          } while (opcaoMenu != 0);
          
          operador.sistemaFinalizado();
          

}
}
