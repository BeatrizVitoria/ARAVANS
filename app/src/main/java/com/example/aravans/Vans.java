package com.example.aravans;

import android.widget.EditText;

import java.io.Serializable;


public class Vans implements Serializable {

    private int codigo;
    private String foto;
    private String placa;
    private String ufPlaca;
    private String responsavel;
    private String origem;
    private String destino;
    private String percurso;
    private String horario;

    public Vans(int codigo, String foto, EditText placa, EditText ufPlaca, EditText responsavel, EditText origem, EditText destino, EditText percurso, EditText horario) {
        this.codigo = codigo;
        this.foto = foto;
        this.placa = placa;
        this.ufPlaca = ufPlaca;
        this.responsavel = responsavel;
        this.origem = origem;
        this.destino = destino;
        this.percurso = percurso;
        this.horario = horario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
        this.ufPlaca = ufPlaca;
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