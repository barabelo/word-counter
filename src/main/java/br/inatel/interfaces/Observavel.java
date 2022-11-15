package br.inatel.interfaces;

public interface Observavel {
    void registrarObservador(Observador observador);

    void removerObservador(Observador observador);

    void notificaObservadores();
}
