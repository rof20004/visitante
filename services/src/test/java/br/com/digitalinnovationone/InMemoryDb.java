package br.com.digitalinnovationone;

import java.util.Hashtable;

public class InMemoryDb implements VisitanteRepositoryPort {

    private final Hashtable<String, Visitante> repository;

    public InMemoryDb() {
        this.repository = new Hashtable<>();
    }

    @Override
    public void salvar(Visitante visitante) {
        repository.put(visitante.getCpf(), visitante);
    }

    @Override
    public Visitante procurarPorCpf(String cpf) {
        return repository.get(cpf);
    }
}
