package br.dev.joaquim.exceptions;

public class InsufficientFoundException extends Exception {
    public InsufficientFoundException(String message) {
        super(message);
    }
}

//throw new InsufficientFoundException ("Saldo insuficiente");