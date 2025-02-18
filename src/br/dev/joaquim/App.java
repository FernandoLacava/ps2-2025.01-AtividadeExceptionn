package br.dev.joaquim;

/**
 * Classe principal do sistema bancário, responsável por inicializar a interface do usuário.
 */
public class App {
  /**
   * Método principal que inicializa a interface do usuário.
   *
   * @param args nenhum argumento é requerido para a execução
   */
  public static void main(String[] args) {
    UserInterface main = new UserInterface();
    main.start();
  }
}
