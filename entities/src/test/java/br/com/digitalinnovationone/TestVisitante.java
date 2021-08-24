package br.com.digitalinnovationone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestVisitante {

    @Test
    void deveInstanciarVisitanteComSucesso() {
        var cpf = "11111111111";
        var nome = "Visitante da DIO";
        assertAll("todos os testes",
                () -> assertDoesNotThrow(() -> new Visitante(cpf, nome)),
                () -> assertEquals(cpf, new Visitante(cpf, nome).getCpf()),
                () -> assertEquals(nome, new Visitante(cpf, nome).getNome())
        );
    }

    @Test
    void deveInstanciarVisitanteMasLancarCpfInvalidoException() {
        var nome = "Visitante da DIO";
        assertThrows(CpfInvalidoException.class, () -> new Visitante(null, nome));
    }

}
