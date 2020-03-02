package br.com.panvel.inferencia;

import java.util.ArrayList;
import java.util.List;

public class Exemplo02 {
    public static void main(String[] args) {
        var listaDeFrutas = List.of("banana", "maça", "abacaxi");

        for(var fruta : listaDeFrutas){
            System.out.println(fruta);
        }
        System.out.println("**********************");
        for(var i=0; i < listaDeFrutas.size(); i++){
            System.out.println(listaDeFrutas.get(i));
        }
    }
}