package com.example.aravans;

import java.io.Serializable;
public class Vans implements Serializable {
    private String foto;
    private String placa;
    private String ufPlaca;
    private String responsavel;
    private String origem;
    private String destino;
    private String percurso;
    private String horario;

    public Vans(String foto, String placa, String ufPlaca, String responsavel, String origem, String destino, String percurso, String horario) {
        this.foto = foto;
        this.placa = placa;
        this.ufPlaca = ufPlaca;
        this.responsavel = responsavel;
        this.origem = origem;
        this.destino = destino;
        this.percurso = percurso;
        this.horario = horario;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getUfPlaca() {
        return ufPlaca;
    }

    public void setUfPlaca(String ufPlaca) {
        ufPlaca = ufPlaca;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
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
        return "Vans{" +
                "foto='" + foto + '\'' +
                ", placa='" + placa + '\'' +
                ", UfPlaca='" + ufPlaca + '\'' +
                ", responsavel='" + responsavel + '\'' +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", percurso='" + percurso + '\'' +
                ", horario='" + horario + '\'' +
                '}';
    }
}