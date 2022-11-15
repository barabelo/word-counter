package br.inatel.observadores.implementacoes;

import br.inatel.interfaces.ContaPalavras;
import br.inatel.observaveis.FraseObservavel;
import br.inatel.observadores.interfaces.ObservaFrase;

import java.util.List;

public class PalavrasIniMaiusculas implements ObservaFrase, ContaPalavras {

    @Override
    public void atualizar(FraseObservavel fraseObservavel) {
        System.out.println("Quantidade de palavras que iniciam com letra maiúscula: "
                + contarPalavras(fraseObservavel.getFrase().getPalavras()));
    }

    @Override
    public int contarPalavras(List<String> palavras) {
        int contador = 0;
        for (String palavra : palavras) {
            if (Character.isUpperCase(palavra.charAt(0))) contador++;
        }
        return contador;
    }
}
