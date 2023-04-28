/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv.arq_soft;

/**
 *
 * @author alexsander
 */
public class LivroCliente implements Observer {
    private String nome;

    public LivroCliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Livro livro) {
        System.out.println(nome + " foi notificado sobre o novo livro " + livro.getTitulo());
    }
}
