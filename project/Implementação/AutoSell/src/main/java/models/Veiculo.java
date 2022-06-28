package models;

import java.awt.*;

public class Veiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String anteriorDono;
    private Image fotoVeiculo;
    private String combustivel;
    private String estado;

    public Veiculo(String matricula, String marca, String modelo, String anteriorDono, Image fotoVeiculo, String combustivel, String estado) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.anteriorDono = anteriorDono;
        this.fotoVeiculo = fotoVeiculo;
        this.combustivel = combustivel;
        this.estado = estado;
    }
}
