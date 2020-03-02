package br.com.panvel.set;

import java.util.HashSet;
import java.util.Set;

public class CustomHashSet {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Notebook");
        set.add("TV");
        set.add("Celular");
        set.add("CPU");
        set.add("Monitor");
        set.add("Mouse");
        set.add("Teclado");
        set.add("Processador");
        set.add("Java");
        set.add("Intel");

        set.forEach(s -> System.out.println(s));
    }
}