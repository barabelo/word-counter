package br.inatel;

import br.inatel.model.Frase;
import br.inatel.observadores.implementacoes.PalavrasPares;
import br.inatel.observaveis.FraseObservavel;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class FraseObservavelEPalavrasParesTest {
    private static Frase frase1, frase2;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private PalavrasPares palavrasPares;
    private FraseObservavel fraseObservavel;

    @BeforeClass
    public static void setUpGeral() {
        frase1 = new Frase("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        frase2 = new Frase("Vivamus massa justo, Dignissim sed elementum Vel, hendrerit Quis Velit.");
    }

    @Before
    public void setUp() {
        fraseObservavel = new FraseObservavel();
        palavrasPares = new PalavrasPares();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void contarPalavrasDaFrase1() {
        fraseObservavel.registraObservador(palavrasPares);
        fraseObservavel.setFrase(frase1);
        fraseObservavel.notificaObservadores();
        assertEquals("Quantidade de palavras com quantidades pares de caracteres: 3", outContent.toString().trim());
    }

    @Test
    public void contarPalavrasDaFrase2() {
        fraseObservavel.registraObservador(palavrasPares);
        fraseObservavel.setFrase(frase2);
        fraseObservavel.notificaObservadores();
        assertEquals("Quantidade de palavras com quantidades pares de caracteres: 1", outContent.toString().trim());
    }
}
