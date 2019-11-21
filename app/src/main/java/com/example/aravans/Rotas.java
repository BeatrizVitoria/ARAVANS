package com.example.aravans;

import java.io.Serializable;
public class Rotas implements Serializable {
    private String origem;
    private String destino;
    private String percurso;
    private String horario;

    public Rotas(String origem, String destino, String percurso, String horario) {
        this.origem = origem;
        this.destino = destino;
        this.percurso = percurso;
        this.horario = horario;
    }

    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public String getPercurso() {
        return percurso;
    }
    public void setPercurso(String percurso) {
        this.percurso = percurso;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    @Override
    public String toString() {
        return "Rotas{" +
                "origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", percurso='" + percurso + '\'' +
                ", horario='" + horario + '\'' +
                '}';
    }
}