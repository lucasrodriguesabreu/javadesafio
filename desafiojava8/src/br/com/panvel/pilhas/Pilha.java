package br.com.panvel.pilhas;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
    private List<String> nomes = new LinkedList<String>();
    /**
     * Em uma pilha, inserimos elementos sempre no topo.
     * Na implementação do java para pilhas(Stack) este
     * método chama-se push.
     */

    public void insere(String nome){
        this.nomes.add(nome);
    }
    /**
     * Em uma pilha, removemos sempre o elemento que está no topo.
     *
     * Na implementação do Java para pilhas(Stack) este
     * método chama-se pop.
     */

    public String remove(){
        return nomes.remove(nomes.size() - 1);
    }

    public String pegaTopo(){
        return nomes.get(nomes.size() - 1);
    }

    public boolean vazia(){
        return nomes.size() == 0;
    }

    public String toString() {
        return this.nomes.toString();
    }
}