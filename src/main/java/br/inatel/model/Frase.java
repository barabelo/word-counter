package br.inatel.model;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Frase {
    private final String conteudo;

    public Frase(String conteudo) {
        this.conteudo = conteudo;
    }

    @Contract(" -> new")
    public @NotNull List<String> getPalavras() {
        String temp = conteudo.trim().replaceAll("[,.;:?!]", " ");
        return new ArrayList<>(Arrays.asList(temp.split(" +")));
    }

}
