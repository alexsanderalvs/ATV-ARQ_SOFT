/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv.arq_soft;

/**
 * Criar uma classe abstrata "Livro" que representa um livro genérico. 
 * Tambem criado as subclasses "LivroInfantil" e "LivroAdulto" que representam os tipos de livros.
 * @author alexsander
 */
public abstract class Livro {
    public abstract String getTitulo();
    public abstract String getAutor();
    public abstract int getAnoPublicacao();
}