package br.com.panvel.lambdas;

//Lambdas

/*
Expressões lambdas, são funções anônimas.
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambdas {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        Comparator<String> comparador = new ComparadorPorTamanho();

        palavras.add("Sol");
        palavras.add("Lucas");
        palavras.add("Lambdas");
        palavras.add("Java");
        palavras.add("Springboot");
        palavras.add("Monitores");

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        palavras.forEach(s -> System.out.println(s));
    }
}