package com.example.aravans;

import java.io.Serializable;
public class Vans implements Serializable {
    private String placa;
    private String conservacao;
    private String responsavel;

    public Vans(String placa, String conservacao, String responsavel) {
        this.placa = placa;
        this.conservacao = conservacao;
        this.responsavel = responsavel;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getConservacao() {
        return conservacao;
    }
    public void setConservacao(String conservacao) {
        this.conservacao = conservacao;
    }
    public String getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    @Override
    public String toString() {
        return "Vans{" +
                "placa='" + placa + '\'' +
                ", conservacao='" + conservacao + '\'' +
                ", responsavel='" + responsavel + '\'' +
                '}';
    }
}
