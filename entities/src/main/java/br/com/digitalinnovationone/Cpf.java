package br.com.digitalinnovationone;

import java.util.Optional;
import java.util.function.Predicate;

public class Cpf {

    private String value;

    public Cpf(String value) {
        this.value = Optional.ofNullable(value).filter(Predicate.not(String::isEmpty)).orElseThrow(CpfInvalidoException::new);
    }

    public String getValue() {
        return value;
    }

}
