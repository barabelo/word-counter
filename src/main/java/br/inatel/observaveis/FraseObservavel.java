package br.inatel.observaveis;

import br.inatel.model.Frase;
import br.inatel.observadores.interfaces.ObservaFrase;

import java.util.ArrayList;
import java.util.List;

public class FraseObservavel {
    private Frase frase;
    private final List<ObservaFrase> observamFrase;

    public FraseObservavel() {
        this.observamFrase = new ArrayList<>();
    }

    public void registraObservador(ObservaFrase observaFrase) {
        observamFrase.add(observaFrase);
    }

    public void removeObservador(ObservaFrase observaFrase) {
        observamFrase.remove(observaFrase);
    }

    public void notificaObservadores() {
        for (ObservaFrase observaFrase : observamFrase) {
            observaFrase.atualizar(this);
        }
    }

    public Frase getFrase() {
        return frase;
    }

    public void setFrase(Frase frase) {
        this.frase = frase;
    }

    public List<ObservaFrase> getObservamFrase() {
        return observamFrase;
    }

}
