package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {

    private Forma forma;

    /**
     * Toda Mano debe crearse con una forma dada, que será
     * la que determine su condición en el juego.
     * @param forma, la Forma que adopta la Mano.
     */
    public Mano(final Forma forma) {
        this.forma = forma;
    }

    /**
     * Evaluará el resultado de la partida según las reglas
     * del juego.
     * @param otra, la otra Mano.
     * @return un Resultado, de acuerdo al estado del juego.
     */
    public Resultado jugarCon(final Mano otra) {
        Resultado[][] matrizResultados = {
                // Piedra
                {Resultado.EMPATA, Resultado.PIERDE, Resultado.PIERDE,
                    Resultado.GANA, Resultado.GANA},
                // Spock
                {Resultado.GANA, Resultado.EMPATA, Resultado.PIERDE,
                        Resultado.PIERDE, Resultado.GANA},
                // Papel
                {Resultado.GANA, Resultado.GANA, Resultado.EMPATA,
                            Resultado.PIERDE, Resultado.PIERDE},
                // Lagarto
                {Resultado.PIERDE, Resultado.GANA, Resultado.GANA,
                                Resultado.EMPATA, Resultado.PIERDE},
                // Tijera
                {Resultado.PIERDE, Resultado.PIERDE, Resultado.GANA,
                                    Resultado.GANA, Resultado.EMPATA}
        };

        return matrizResultados[this.forma.getValor()][otra.forma.getValor()];
    }

}
