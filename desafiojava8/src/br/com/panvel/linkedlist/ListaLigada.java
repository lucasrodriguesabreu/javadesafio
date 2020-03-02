package br.com.panvel.linkedlist;

public class ListaLigada {

    private Celula primeira = null;
    private Celula ultima = null;
    private int total = 0;

    public void adicionaNoComeco(Object elemento){ //esse método adiciona um objeto no começo da lista
        Celula nova = new Celula(elemento, this.primeira);
        this.primeira = nova;
        if(this.total == 0){
            this.ultima = this.primeira;
        }
        this.total = this.total + 1;
    }
    public void adiciona(Object elemento){ //esse método adiciona um objeto no final da lista
        if(this.total == 0){
            this.adicionaNoComeco(elemento);
        }else{
            Celula nova = new Celula(elemento, null);
            this.ultima.setProximo(nova);
            this.ultima = nova;
            this.total = this.total + 1;
        }
    }
    /*public adiciona(int posicao, Object elemento){ //método que adiciona um elemento no meio da lista de acordo com a posição
        if(posicao == 0){
            this.adicionaNoComeco(elemento);
        }else if(posicao == this.total){
            this.adiciona(elemento);
        }else{
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula nova = new Celula(elemento, anterior.getProximo());
            anterior.setProximo(nova);
            this.total = this.total + 1;
        }
    }*/
    public Object pega(int posicao){
        return this.pegaCelula(posicao).getElemento();
    }
    public void removeDoComeco() {
        if (this.total == 0) {
            throw new IllegalArgumentException("Lista vazia");
        }
        this.primeira = this.primeira.getProximo();
        this.total = this.total - 1;

        if (this.total == 0) {
            this.ultima = null;
        }
    }
    public int tamanho(){
        return this.total;
    }
    public boolean contem(Object obj){
        //TO DO
        return false;
    }
    public String toString(){
        if(total == 0){
            return "[]";
        }
        Celula atual = primeira;
        StringBuilder builder = new StringBuilder("[");
        for(int i = 0; i < total; i++){
            builder.append(atual.getElemento());
            builder.append(",");

            atual = atual.getProximo();
        }
        builder.append("]");
        return builder.toString();
    }
    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao< this.total;
    }
    private Celula pegaCelula(int posicao){
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição inexistente");
        }
        Celula atual = this.primeira;

        for(int i = 0; i < posicao; i++){
            atual = atual.getProximo();
        }
        return atual;
    }
}