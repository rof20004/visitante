package br.com.digitalinnovationone;

public interface VisitanteServicePort {

    void cadastrar(VisitanteDto dto);
    Visitante procurarPorCpf(String cpf);

}
