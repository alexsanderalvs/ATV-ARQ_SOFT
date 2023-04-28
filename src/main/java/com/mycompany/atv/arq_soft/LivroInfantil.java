/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv.arq_soft;

/**
 *
 * @author alexsander
 */
public class LivroInfantil extends Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public LivroInfantil(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
}
