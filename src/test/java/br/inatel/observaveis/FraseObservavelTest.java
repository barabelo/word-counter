package br.inatel.observaveis;

import br.inatel.observadores.implementacoes.TotalDePalavras;
import br.inatel.observadores.interfaces.ObservaFrase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FraseObservavelTest {

    private FraseObservavel fraseObservavel;

    @Before
    public void setUp() {
        fraseObservavel = new FraseObservavel();
    }

    @Test
    public void umInscritoTest() {
        ObservaFrase totalDePalavras = new TotalDePalavras();
        fraseObservavel.registraObservador(totalDePalavras);
        assertEquals(1, fraseObservavel.getObservamFrase().size());
    }

    @Test
    public void removeUmInscritoTest() {
        ObservaFrase totalDePalavras = new TotalDePalavras();
        fraseObservavel.registraObservador(totalDePalavras);
        fraseObservavel.removeObservador(totalDePalavras);
        assertEquals(0, fraseObservavel.getObservamFrase().size());
    }
}