package br.com.panvel.example;

public class Main {
    public static void main(String[] args) {

        var palavra = "   Teste!!   ";
        var palavra1 = "";
        var palavra2 = "Teste de stripTrailing()!              ";

        System.out.println("Teste de repeat()");
        System.out.println("palavra.repeat(3) = " + palavra.repeat(3));

        System.out.println("Teste de strip()");
        System.out.println("palavra.strip() = " + palavra.strip());

        System.out.println("Teste de isBlank()");
        System.out.println("palavra.isBlank() = " + palavra1.isBlank());

        System.out.println("Teste de stripTrailing()");
        System.out.println("palavra.stripTrailing() = " + palavra2.stripTrailing());
    }
}