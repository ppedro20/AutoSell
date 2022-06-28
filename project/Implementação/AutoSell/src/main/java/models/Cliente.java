package models;
import java.util.LinkedList;

public class Cliente extends Descritor {
    private int idade;
    private String morada;

    public Cliente(String nome, int idade, String morada) {
        super(nome);
        this.idade = idade;
        this.morada = morada;
    }
}
