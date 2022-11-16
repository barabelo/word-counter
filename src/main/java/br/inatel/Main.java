package br.inatel;

import br.inatel.model.Frase;
import br.inatel.observadores.implementacoes.PalavrasIniMaiusculas;
import br.inatel.observadores.implementacoes.PalavrasPares;
import br.inatel.observadores.implementacoes.TotalDePalavras;
import br.inatel.observaveis.FraseObservavel;

import java.util.Scanner;

public class Main {
    private static final FraseObservavel fraseObservavel = new FraseObservavel();
    private static final TotalDePalavras totalDePalavras = new TotalDePalavras();
    private static final PalavrasPares palavrasPares = new PalavrasPares();
    private static final PalavrasIniMaiusculas palavrasIniMaiusculas = new PalavrasIniMaiusculas();

    public static void main(String[] args) {
        setUp();
        String txt;
        do {
            System.out.println("Digite uma frase ou ++s para sair: ");
            Scanner sc = new Scanner(System.in);
            txt = sc.nextLine();
            if (txt.length() > 0) {
                if (!txt.equals("++s")) {
                    fraseObservavel.setFrase(new Frase(txt));
                    fraseObservavel.notificaObservadores();
                }
            }
        } while (!txt.equals("++s"));
    }

    private static void setUp() {
        fraseObservavel.registraObservador(totalDePalavras);
        fraseObservavel.registraObservador(palavrasPares);
        fraseObservavel.registraObservador(palavrasIniMaiusculas);
    }

}
