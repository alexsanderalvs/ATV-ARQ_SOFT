/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv.arq_soft;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexsander
 */
public class Subject {
    private List<Observer> observers;
    private List<Livro> livros;

    public Subject() {
        observers = new ArrayList<>();
        livros = new ArrayList<>();
    }

    public void addLivro(Livro livro) {
        livros.add(livro);
        notifyObservers(livro);
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers(Livro livro) {
        for (Observer observer : observers) {
            observer.update(livro);
        }
    }
}