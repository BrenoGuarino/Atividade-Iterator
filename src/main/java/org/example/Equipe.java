package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Equipe implements Iterable<Jogador>{

    private List<Jogador> jogadores = new ArrayList<Jogador>();

    public Equipe(Jogador... jogadores) {
        this.jogadores = Arrays.asList(jogadores);
    }

    @Override
    public Iterator<Jogador> iterator() {
        return jogadores.iterator();
    }

}