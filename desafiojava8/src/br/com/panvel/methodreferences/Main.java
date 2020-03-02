package br.com.panvel.methodreferences;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        palavras.add("Teste 000001");
        palavras.add("Teste 00002");
        palavras.add("Teste 0003");
        palavras.add("Teste 004");
        palavras.add("Teste 05");

        /**
         * Ao invés de usar o código de trecho abaixo, conforme vimos em lambdas, vamos usar o method references
         */
        /*
        Comparator<String> comparador = Comparator.comparing(new Function<String, Integer>(){
            public Integer apply(String s){
                return s.length();
            }
        });
        palavras.sort(Comparator.comparing(s -> s.length()));*/
        /*Aqui começamos a usar method references - Forma 1
        palavras.sort(Comparator.comparing(String::length));
        */
        /*Forma 2 de usar Method references
        Function<String, Integer> tamanho = String::length;
        Comparator<String> comparador = Comparator.comparing(tamanho);
        palavras.sort(comparador);
        */
        //Forma 3
        palavras.forEach(System.out::println);
    }
}