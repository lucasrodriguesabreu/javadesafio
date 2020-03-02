package br.com.panvel.filas;
//Filas
/*

Todo o elemento entra no final da fila.

O primeiro elemento a entrar é também o primeiro a sair.

< -[0][1][2][3][4][5]
*/

public class Main {

    public static void main(String[] args) {
        Fila fila = new Fila();

        System.out.println(fila);

        fila.adiciona("Alexandre");
        fila.adiciona("Harry");
        fila.adiciona("Vinicius");

        System.out.println(fila);

        String ret = fila.remove();
        System.out.println("O nome removido foi: " + ret);

        System.out.println(fila);

        fila.remove();
        fila.remove();
        fila.remove();
        System.out.println(fila.vazia());
        System.out.println(fila);
    }
}