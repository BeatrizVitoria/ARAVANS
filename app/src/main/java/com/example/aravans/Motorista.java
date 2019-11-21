package com.example.aravans;

    public class Motorista extends Pessoa {
        private String cnh;

        public Motorista(String nome, String telefone, String email, String dtnasc, String login, String senha, String cnh){
            super(nome, telefone, email, dtnasc, login, senha);
            this.cnh = cnh;
        }

        public String getCnh() {
            return cnh;
        }
        public void setCnh(String cnh) {
            this.cnh = cnh;
        }
        @Override
        public String toString() {
            return "Motorista{" +
                    "cnh='" + cnh + '\'' +
                    '}';
        }
    }