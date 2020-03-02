package br.com.panvel.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class CustomLinkedList {

    public static void main(String[] args) {
        List<String> lista = new LinkedList<String>();

        System.out.println(lista.size());

        lista.add("Catarina");
        lista.add("Marta");

        lista.add(0, "Maria");

        System.out.println(lista);
    }
}
