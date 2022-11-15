package br.inatel.observadores.implementacoes;

import br.inatel.interfaces.ContaPalavras;
import br.inatel.observaveis.FraseObservavel;
import br.inatel.observadores.interfaces.ObservaFrase;

import java.util.List;

public class PalavrasPares implements ObservaFrase, ContaPalavras {
    @Override
    public void atualizar(FraseObservavel fraseObservavel) {
        System.out.println("Quantidade de palavras com quantidades pares de caracteres: "
                + contarPalavras(fraseObservavel.getFrase().getPalavras()));
    }

    @Override
    public int contarPalavras(List<String> palavras) {
        int contador = 0;
        for (String palavra : palavras) {
            if (palavra.length() % 2 == 0) contador++;
        }
        return contador;
    }
}
