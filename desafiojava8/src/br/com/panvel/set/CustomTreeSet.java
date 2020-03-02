package br.com.panvel.set;

import java.util.Set;
import java.util.TreeSet;

/*
Nesse exemplo vou imprimir a lista em ordem alfabética.
 */
public class CustomTreeSet {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();

        set.add("Televisão");
        set.add("Celular");
        set.add("Notebook");

        for(String p : set){
            System.out.println(p);
        }
    }
}