package br.dev.joaquim.exceptions;

/**
 * Exceção personalizada para indicar que o saldo da conta é insuficiente para realizar o saque.
 */
public class InsufficientFoundException extends Exception {
    /**
     * Construtor da exceção InsufficientFoundException.
     *
     * @param message a mensagem de erro associada à exceção
     */
    public InsufficientFoundException(String message) {
        super(message);
    }
}
