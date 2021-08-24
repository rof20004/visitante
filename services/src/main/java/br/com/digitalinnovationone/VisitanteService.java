package br.com.digitalinnovationone;

public class VisitanteService implements VisitanteServicePort {

    private final VisitanteRepositoryPort repository;

    public VisitanteService(final VisitanteRepositoryPort repository) {
        this.repository = repository;
    }

    @Override
    public void cadastrar(VisitanteDto dto) {
        if (dto == null) {
            throw new VisitanteNaoInformadoException();
        }

        var visitante = new Visitante(dto.getCpf(), dto.getNome());
        repository.salvar(visitante);
    }

    @Override
    public Visitante procurarPorCpf(String cpf) {
        return repository.procurarPorCpf(cpf);
    }
}
