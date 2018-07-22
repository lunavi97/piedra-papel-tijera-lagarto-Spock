package edu.tallerweb.pptls;

/**
 * Las diferentes Formas que existen en el juego.
 */
public enum Forma {

  /**
   * Piedra.
   */
  PIEDRA(0),

  /**
   * Spock.
   */
  SPOCK(1),

  /**
   * Papel.
   */
  PAPEL(2),

  /**
   * Lagarto.
   */
  LAGARTO(3),

  /**
   * Tijera.
   */
  TIJERA(4);

  /**
   * Valor de la forma.
   */
  private final Integer valor;

  /**
   * Constructor de forma.
   * @param argValor - Valor de la forma
   */
  Forma(final Integer argValor) {
    valor = argValor;
  }

  /**
   * Obtener el valor de la forma.
   * @return Valor de forma
   */
  public final Integer getValor() {
    return this.valor;
  }

}
