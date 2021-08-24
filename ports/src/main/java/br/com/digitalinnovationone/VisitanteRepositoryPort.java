package br.com.digitalinnovationone;

public interface VisitanteRepositoryPort {

    void salvar(Visitante visitante);
    Visitante procurarPorCpf(String cpf);

}
