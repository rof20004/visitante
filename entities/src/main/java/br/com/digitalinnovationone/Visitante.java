package br.com.digitalinnovationone;

public class Visitante {

    private Cpf cpf;
    private String nome;

    public Visitante(String cpf, String nome) {
        this.cpf = new Cpf(cpf);
        this.nome = nome;
    }

    public String getCpf() {
        return cpf.getValue();
    }

    public String getNome() {
        return nome;
    }

}
