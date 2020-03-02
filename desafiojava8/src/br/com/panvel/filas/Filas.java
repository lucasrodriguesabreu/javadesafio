package br.com.panvel.filas;
/*
Essa classe é apenas para utilizar uma implementação do Java.
 */

import java.util.LinkedList;
import java.util.Queue;

public class Filas {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        System.out.println(fila);
        fila.add("Lucas");//Inserindo
        fila.add("Jean");//Inserindo
        fila.add("Vinicius");//Inserindo

        System.out.println(fila);

        String ret = fila.poll(); //Remover
        System.out.println("O nome removido foi o " + ret + ".");

        System.out.println(fila);
    }
}