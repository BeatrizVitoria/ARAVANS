package com.example.aravans;

import java.io.Serializable;

public class Pessoa implements Serializable {
        private String nome;
        private String telefone;
        private String email;
        private String dtnasc;
        private String login;
        private String senha;

        public Pessoa(String nome, String telefone, String email, String dtnasc, String login, String senha) {
            this.nome = nome;
            this.telefone = telefone;
            this.email = email;
            this.dtnasc = dtnasc;
            this.login = login;
            this.senha = senha;
        }

        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getTelefone() {
            return telefone;
        }
        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getDtnasc() {
            return dtnasc;
        }
        public void setDtnasc(String dtnasc) {
            this.dtnasc = dtnasc;
        }
        public String getLogin() {
            return login;
        }
        public void setLogin(String login) {
            this.login = login;
        }
        public String getSenha() {
            return senha;
        }
        public void setSenha(String senha) {
            this.senha = senha;
        }
        @Override
        public String toString() {
            return "Pessoa{" +
                    "nome='" + nome + '\'' +
                    ", telefone='" + telefone + '\'' +
                    ", email='" + email + '\'' +
                    ", dtnasc='" + dtnasc + '\'' +
                    ", login='" + login + '\'' +
                    ", senha='" + senha + '\'' +
                    '}';
        }
    }