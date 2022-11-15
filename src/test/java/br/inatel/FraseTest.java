package br.inatel;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FraseTest {
    private static String texto1;
    private static String texto2;
    private static List<String> palavras1;
    private static List<String> palavras2;

    @BeforeClass
    public static void setUp() {
        texto1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        palavras1 = new ArrayList<>();
        palavras1.add("Lorem");
        palavras1.add("ipsum");
        palavras1.add("dolor");
        palavras1.add("sit");
        palavras1.add("amet");
        palavras1.add("consectetur");
        palavras1.add("adipiscing");
        palavras1.add("elit");

        texto2 = "  Lorem  ;  ipsum .  . dolor , ,  sit  ,; amet, consectetur    adipiscing     elit  .  ";
        palavras2 = palavras1;
    }

    @Test
    public void getPalavrasComTexto1Test() {
        Frase frase = new Frase(texto1);
        assertArrayEquals(palavras1.toArray(), frase.getPalavras().toArray());
    }

    @Test
    public void getPalavrasComTexto2Test() {
        Frase frase = new Frase(texto2);
        assertArrayEquals(palavras2.toArray(), frase.getPalavras().toArray());
    }
}