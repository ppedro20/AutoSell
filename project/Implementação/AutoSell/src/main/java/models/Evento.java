package models;

public class Evento extends Descritor {
    private String local;
    private String dataInicio;
    private String dataFim;

    public Evento(String nome, String local, String dataInicio, String dataFim) {
        super(nome);
        this.local = local;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
}
