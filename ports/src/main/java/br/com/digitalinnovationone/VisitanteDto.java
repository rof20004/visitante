package br.com.digitalinnovationone;

public class VisitanteDto {

    private String cpf;
    private String nome;

    public VisitanteDto() {}

    public VisitanteDto(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
