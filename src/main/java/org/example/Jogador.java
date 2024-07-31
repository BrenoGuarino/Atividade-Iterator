package org.example;

public class Jogador {

    private String nome;
    private boolean lesionado;

    public Jogador(String nome, boolean lesionado) {
        this.nome = nome;
        this.lesionado = lesionado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }
}