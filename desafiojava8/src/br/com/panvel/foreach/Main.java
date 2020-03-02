package br.com.panvel.foreach;

public class Main {

    public static void main(String[] args) {
        String nome = "Lucas Abreu";
        //Para cada um dos caracteres da string, imprima o caractere
        for (char letra : nome.toCharArray()){
            System.out.println(letra);
            //System.out.print(letra);
        }
    }
}