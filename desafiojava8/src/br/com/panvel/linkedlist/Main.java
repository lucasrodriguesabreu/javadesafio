package br.com.panvel.linkedlist;
//LinkedList //Programa57

/*Em um vetor, os elementos estão um do lado do outro, enquanto em uma lista
ligada, eles estão em lugares diferentes, porém, um aponta para o outro
indicando o próximo elemento.

Exemplo: [0][3][1][5][4][2]
 */

public class Main {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adiciona("Angelina");
        lista.adiciona("Claudia");
        lista.adiciona("Maria");
        System.out.println(lista);

        lista.removeDoComeco();
        System.out.println(lista);

        lista.removeDoComeco();
    }
}