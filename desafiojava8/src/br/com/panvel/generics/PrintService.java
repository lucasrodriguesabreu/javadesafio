package br.com.panvel.generics;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

    private List<Integer> list = new ArrayList<>();

    public void addValue(Integer value){
        list.add(value);
    }
    /**
     * Crio o if p verificar se a lista está vazia, caso não esteja,
     * retorna o primeiro número digitado.
     * @return
     */
    public Integer first(){
        if(list.isEmpty()){
            throw new IllegalStateException("A lista está vazia!");
        }
        return list.get(0);
    }
    /**
     * Começo imprimindo o colchete
     * Se a lista tiver ao menos um elemento, ela imprime ele
     * Para o segundo elemento em diante, imprime uma vírgula e um espaço
     * Imprime os demais elementos
     * No final imprime o colchete para fechar a questão.
     */
    public void print(){
        System.out.print("[");
        if(!list.isEmpty()){
            System.out.print(list.get(0));
        }
        for(int i = 1; i < list.size(); i++){
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
}