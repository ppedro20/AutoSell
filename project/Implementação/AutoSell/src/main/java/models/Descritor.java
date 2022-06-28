package models;

public abstract class Descritor {
    private String nome;

    public Descritor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

