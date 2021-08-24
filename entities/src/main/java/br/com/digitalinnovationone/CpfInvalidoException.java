package br.com.digitalinnovationone;

public class CpfInvalidoException extends RuntimeException {

    public CpfInvalidoException() {
        super("cpf do visitante está inválido");
    }

}
