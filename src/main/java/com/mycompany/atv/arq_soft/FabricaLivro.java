/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv.arq_soft;

/**
 * Criado a classe fábrica "FabricaLivro" que retorna instâncias de livros com base em um parâmetro passado.
 * @author alexsander
 */
public class FabricaLivro {
    public Livro criarLivro(String tipoLivro, String titulo, String autor, int anoPublicacao) {
        if (tipoLivro.equalsIgnoreCase("infantil")) {
            return new LivroInfantil(titulo, autor, anoPublicacao);
        } else if (tipoLivro.equalsIgnoreCase("adulto")) {
            return new LivroAdulto(titulo, autor, anoPublicacao);
        } else {
            throw new IllegalArgumentException("Tipo de livro inválido.");
        }
    }
}