package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego.
 */
public class Mano {

  /**
   * Forma.
   */
  private final Forma forma;

  /**
   * Toda Mano debe crearse con una forma dada, que será
   * la que determine su condición en el juego.
   * @param argForma - la Forma que adopta la Mano.
   */
  public Mano(final Forma argForma) {
    forma = argForma;
  }

  /**
   * Evaluará el resultado de la partida según las reglas
   * del juego.
   * @param otra - la otra Mano.
   * @return un Resultado, de acuerdo al estado del juego.
   */
  public Resultado jugarCon(final Mano otra) {
    Resultado[][] matrizResultados = {
        // Piedra
        {
          Resultado.EMPATA, // Piedra
          Resultado.PIERDE, // Spock
          Resultado.PIERDE, // Papel
          Resultado.GANA,   // Lagarto
          Resultado.GANA    // Tijera
        },
        // Spock
        {
          Resultado.GANA,   // Piedra
          Resultado.EMPATA, // Spock
          Resultado.PIERDE, // Papel
          Resultado.PIERDE, // Lagarto
          Resultado.GANA    // Tijera
        },
        // Papel
        {
          Resultado.GANA,   // Piedra
          Resultado.GANA,   // Spock
          Resultado.EMPATA, // Papel
          Resultado.PIERDE, // Lagarto
          Resultado.PIERDE  // Tijera
        },
        // Lagarto
        {
          Resultado.PIERDE, // Piedra
          Resultado.GANA,   // Spock
          Resultado.GANA,   // Papel
          Resultado.EMPATA, // Lagarto
          Resultado.PIERDE  // Tijera
        },
        // Tijera
        {
          Resultado.PIERDE, // Piedra
          Resultado.PIERDE, // Spock
          Resultado.GANA,   // Papel
          Resultado.GANA,   // Lagarto
          Resultado.EMPATA  // Tijera
        }
    };

    return matrizResultados[this.forma.getValor()][otra.forma.getValor()];
  }

  /**
   * Obtener forma.
   * @return Forma
   */
  public final Forma getForma() {
    return forma;
  }

}
