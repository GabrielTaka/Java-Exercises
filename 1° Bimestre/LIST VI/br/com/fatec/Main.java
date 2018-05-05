package br.com.fatec;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String vermelho = "\033[31m";
        String limpo = "\033[m";

        int setup;
        System.out.println(vermelho + "\t*************************" + limpo + " LISTA  6 " + vermelho + "*************************" + limpo);
        System.out.println(vermelho + "\t*************" + limpo + " PROGRAMAÇÃO ORIENTADA À OBEJETOS " + vermelho + "*************" + limpo);
        System.out.println(vermelho + "\t**************" + limpo + " DESENVOLVIDO POR ALEXIS LOPES " + vermelho + "***************" + limpo + "\n");


        Estoque estoque = new Estoque();
        estoque.intro();

    }
}
