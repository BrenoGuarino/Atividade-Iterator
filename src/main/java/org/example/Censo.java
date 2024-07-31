package org.example;

import java.util.Iterator;

public class Censo {

    public static Integer contarTotalJogadoresLesionados(Equipe equipe) {
        int quantidade = 0;
        for (Jogador jogador : equipe) {
            if (jogador.isLesionado()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalJogadoresEquipe(Equipe equipe) {
        int quantidade = 0;
        for (Iterator a = equipe.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}