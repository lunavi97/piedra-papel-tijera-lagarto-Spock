package edu.tallerweb.pptls;

import static org.junit.Assert.*;
import org.junit.Test;

public class PartidaTests {

    @Test
    public void queSpockVaporizaPiedra() {

        Mano jugadorUno = new Mano(Forma.SPOCK);
        Mano jugadorDos = new Mano(Forma.PIEDRA);

        assertEquals("Spock vaporiza piedra",
                Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

    }

    @Test
    public void queTijeraCortaPapel() {
        Mano jugadorUno = new Mano(Forma.TIJERA);
        Mano jugadorDos = new Mano(Forma.PAPEL);

        assertEquals("Tijera corta papel",
                Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
    }

    @Test
    public void quePapelCubrePiedra() {
        Mano jugadorUno = new Mano(Forma.PAPEL);
        Mano jugadorDos = new Mano(Forma.PIEDRA);

        assertEquals("Papel cubre piedra",
                Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
    }

    @Test
    public void quePiedraAplastaLagarto() {
        Mano jugadorUno = new Mano(Forma.PIEDRA);
        Mano jugadorDos = new Mano(Forma.LAGARTO);

        assertEquals("Piedra aplasta lagarto",
                Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
    }

    @Test
    public void queLagartoEnvenenaSpock() {
        Mano jugadorUno = new Mano(Forma.LAGARTO);
        Mano jugadorDos = new Mano(Forma.SPOCK);

        assertEquals("Lagarto envenena spock",
                Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
    }

    @Test
    public void queSpockDestrozaTijera() {
        Mano jugadorUno = new Mano(Forma.SPOCK);
        Mano jugadorDos = new Mano(Forma.TIJERA);

        assertEquals("Spock destroza tijera",
                Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
    }

    @Test
    public void queTijeraDecapitaLagarto() {
        Mano jugadorUno = new Mano(Forma.TIJERA);
        Mano jugadorDos = new Mano(Forma.LAGARTO);

        assertEquals("Tijera decapita lagarto",
                Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
    }

    @Test
    public void queLagartoComePapel() {
        Mano jugadorUno = new Mano(Forma.LAGARTO);
        Mano jugadorDos = new Mano(Forma.PAPEL);

        assertEquals("Lagarto come papel",
                Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
    }

    @Test
    public void quePapelRefutaSpock() {
        Mano jugadorUno = new Mano(Forma.PAPEL);
        Mano jugadorDos = new Mano(Forma.SPOCK);

        assertEquals("Papel refuta spock",
                Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
    }

    @Test
    public void quePiedraAplastaTijera() {
        Mano jugadorUno = new Mano(Forma.PIEDRA);
        Mano jugadorDos = new Mano(Forma.TIJERA);

        assertEquals("Piedra aplasta tijera",
                Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
    }

    @Test
    public void derrota() {
        Mano jugadorUno, jugadorDos;

        jugadorUno = new Mano(Forma.TIJERA);
        jugadorDos = new Mano(Forma.PIEDRA);

        assertEquals("Tijera es aplastada por piedra",
                Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

        jugadorUno = new Mano(Forma.SPOCK);
        jugadorDos = new Mano(Forma.PAPEL);

        assertEquals("Spock es refutado por papel",
                Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

        jugadorUno = new Mano(Forma.PAPEL);
        jugadorDos = new Mano(Forma.LAGARTO);

        assertEquals("Papel es comido por lagarto",
                Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));
    }

    @Test
    public void empate() {
        Mano jugadorUno, jugadorDos;

        jugadorUno = new Mano(Forma.PIEDRA);
        jugadorDos = new Mano(Forma.PIEDRA);

        assertEquals("Piedra empata con piedra",
                Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));

        jugadorUno = new Mano(Forma.PAPEL);
        jugadorDos = new Mano(Forma.PAPEL);

        assertEquals("Papel empata con papel",
                Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));

        jugadorUno = new Mano(Forma.TIJERA);
        jugadorDos = new Mano(Forma.TIJERA);

        assertEquals("Tijera empata con tijera",
                Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));

        jugadorUno = new Mano(Forma.LAGARTO);
        jugadorDos = new Mano(Forma.LAGARTO);

        assertEquals("Lagarto empata con lagarto",
                Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));

        jugadorUno = new Mano(Forma.SPOCK);
        jugadorDos = new Mano(Forma.SPOCK);

        assertEquals("Spock empata con spock",
                Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));
    }

}
