package br.dev.joaquim.bank;

import br.dev.joaquim.exceptions.InsufficientFoundException;

/**
 * Representa uma conta bancária com funcionalidades básicas de depósito e saque.
 */
public class BankAccount {
  private int accountNumber;
  private double balance;
  private String accountHolderName;

  /**
   * Construtor padrão da classe BankAccount.
   */
  public BankAccount() {
  }

  /**
   * Construtor da classe BankAccount, inicializa a conta com número da conta,
   * saldo inicial e o nome do titular.
   *
   * @param accountNumber o número da conta
   * @param balance o saldo inicial da conta
   * @param accountHolderName o nome do titular da conta
   */
  public BankAccount(int accountNumber, double balance, String accountHolderName) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.accountHolderName = accountHolderName;
  }

  /**
   * Obtém o número da conta.
   *
   * @return o número da conta
   */
  public int getAccountNumber() {
    return accountNumber;
  }

  /**
   * Obtém o saldo da conta.
   *
   * @return o saldo da conta
   */
  public double getBalance() {
    return balance;
  }

  /**
   * Obtém o nome do titular da conta.
   *
   * @return o nome do titular da conta
   */
  public String getAccountHolderName() {
    return accountHolderName;
  }

  /**
   * Realiza um depósito na conta.
   *
   * @param value o valor a ser depositado
   * @throws IllegalArgumentException se o valor for negativo
   */
  public void deposit(double value) {
    if (value < 0) {
      throw new IllegalArgumentException("O valor precisa ser positivo, foi informado o valor R$ " + value);
    }
    this.balance += value;
  }

  /**
   * Realiza um saque da conta, caso o saldo seja suficiente.
   *
   * @param value o valor a ser sacado
   * @throws InsufficientFoundException se o saldo for insuficiente
   * @throws IllegalArgumentException se o valor for negativo
   */
  public void withdraw(double value) throws InsufficientFoundException {
    if (value < 0) {
      throw new IllegalArgumentException("O valor precisa ser positivo, foi informado o valor R$ " + value);
    }

    if (value > this.balance) {
      throw new InsufficientFoundException("O valor R$ " + value + " é superior ao saldo [R$ " + this.balance + "]");
    }

    this.balance -= value;
  }

  /**
   * Retorna uma representação textual da conta bancária.
   *
   * @return uma string representando os dados da conta
   */
  @Override
  public String toString() {
    return "Conta " + accountNumber + " de " + accountHolderName + " têm R$ " + balance + " de saldo";
  }
}
