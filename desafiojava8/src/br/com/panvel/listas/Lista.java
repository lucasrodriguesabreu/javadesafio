package br.com.panvel.listas;
//Listas

import java.util.ArrayList;
import java.util.Collections;

public class Lista {

    public static void main(String[] args) {
        //ArrayList nomes = new ArrayList(); //Sem definir tipo de dado, podemos colocar qualquer tipo
        /**
         * Na linha 15 eu defini os dados utilizados como String utilizando o generics.
         * Exemplo de outros tipos de dados adicionados nas linhas 23, 24, 25 e 26
         */
        ArrayList<String> nomes = new ArrayList<String>(); //Definimos o tipo String

        nomes.add("Maria");
        nomes.add("Cátia");
        nomes.add("Marta");
        nomes.add("Bianca");
        nomes.add("Fernanda");
        /*
        nomes.add(44);
        nomes.add(true);
        nomes.add(12.4);
        nomes.add('e');
        */
        //System.out.println(nomes.get(0));
        //System.out.println(nomes.get(3));

        /*for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }*/

        //Essa função abaixo exibe os arrays em ordem alfabética
        Collections.sort(nomes);

        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
