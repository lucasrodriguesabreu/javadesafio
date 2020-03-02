package br.com.panvel.set;

import java.util.LinkedHashSet;
import java.util.Set;

/*
Nesse exemplo vou imprimir a lista na ordem em que ela foi inserida.
 */
public class CustomLinkedHashSet {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        set.add("Televisão");
        set.add("Notebook");
        set.add("Celular");

        for(String p : set){
            System.out.println(p);
        }
    }
}