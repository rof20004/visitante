package br.com.digitalinnovationone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestVisitanteService {

    @Test
    void deveCadastrarVisitanteComSucesso() {
        var cpf = "11111111111";
        var nome = "Visitante da DIO";
        var dto = new VisitanteDto(cpf, nome);
        var repository = new InMemoryDb();
        var service = new VisitanteService(repository);
        assertDoesNotThrow(() -> service.cadastrar(dto));
    }

    @Test
    void deveCadastrarVisitanteMasDeveLancarVisitanteNaoInformadoException() {
        var repository = new InMemoryDb();
        var service = new VisitanteService(repository);
        assertThrows(VisitanteNaoInformadoException.class, () -> service.cadastrar(null));
    }

}
