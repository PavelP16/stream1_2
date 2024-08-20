package service;

public class ParameterValidatorException extends RuntimeException {
    public ParameterValidatorException(String param) {
        super("Invalid parametd:%$".formatted(param));
    }
}
