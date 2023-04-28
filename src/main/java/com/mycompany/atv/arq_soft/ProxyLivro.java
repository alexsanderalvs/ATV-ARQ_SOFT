/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv.arq_soft;

/**
 *  Vai controla o acesso aos livros e adiciona funcionalidades extras, como registro de chamadas
 * Pendente - Registro da quantidade de acessos
 * @author alexsander
 */
public class ProxyLivro extends Livro {
    private Livro livro;
    private int qtdAcessos;

    public ProxyLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String getTitulo() {
        qtdAcessos++;
        return livro.getTitulo();
    }

    @Override
    public String getAutor() {
        qtdAcessos++;
        return livro.getAutor();
    }

    @Override
    public int getAnoPublicacao() {
        qtdAcessos++;
        return livro.getAnoPublicacao();
    }           
                
}