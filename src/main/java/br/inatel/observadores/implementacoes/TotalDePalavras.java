package br.inatel.observadores.implementacoes;

import br.inatel.interfaces.ContaPalavras;
import br.inatel.observaveis.FraseObservavel;
import br.inatel.observadores.interfaces.ObservaFrase;

import java.util.List;

public class TotalDePalavras implements ObservaFrase, ContaPalavras {
    @Override
    public void atualizar(FraseObservavel fraseObservavel) {
        System.out.println("Quantidade total de palavras: "
                + contarPalavras(fraseObservavel.getFrase().getPalavras()));
    }

    @Override
    public int contarPalavras(List<String> palavras) {
        return palavras.size();
    }
}
