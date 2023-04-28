/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv.arq_soft;

/**
 *
 * @author alexsander
 */
public class Main {
    public static void main(String[] args) {
        Subject livraria = new Subject();

        LivroCliente cliente1 = new LivroCliente("João");
        LivroCliente cliente2 = new LivroCliente("Maria");

        livraria.registerObserver(cliente1);
        livraria.registerObserver(cliente2);

        Livro livroInfantil = new FabricaLivro().criarLivro("infantil", "O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        livraria.addLivro(livroInfantil);

        Livro livroAdulto = new FabricaLivro().criarLivro("adulto", "Romeu e Julieta", "William Shakespeare", 1597);
        livraria.addLivro(livroAdulto);
    }
}
