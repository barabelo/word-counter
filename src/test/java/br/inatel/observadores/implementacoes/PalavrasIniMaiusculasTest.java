package br.inatel.observadores.implementacoes;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PalavrasIniMaiusculasTest {
    private static List<String> palavras1, palavras2;
    private PalavrasIniMaiusculas palavrasIniMaiusculas;

    @BeforeClass
    public static void setUpGeral() {
        palavras1 = new ArrayList<>();
        palavras1.add("Lorem");
        palavras1.add("ipsum");
        palavras1.add("dolor");
        palavras1.add("sit");
        palavras1.add("amet");
        palavras1.add("consectetur");
        palavras1.add("adipiscing");
        palavras1.add("elit");

        palavras2 = new ArrayList<>();
        palavras2.add("Vivamus");
        palavras2.add("massa");
        palavras2.add("justo");
        palavras2.add("Dignissim");
        palavras2.add("sed");
        palavras2.add("elementum");
        palavras2.add("Vel");
        palavras2.add("hendrerit");
        palavras2.add("Quis");
        palavras2.add("Velit");
    }

    @Before
    public void setUp() {
        palavrasIniMaiusculas = new PalavrasIniMaiusculas();
    }

    @Test
    public void contarPalavras1() {
        assertEquals(1, palavrasIniMaiusculas.contarPalavras(palavras1));
    }

    @Test
    public void contarPalavras2() {
        assertEquals(5, palavrasIniMaiusculas.contarPalavras(palavras2));
    }
}