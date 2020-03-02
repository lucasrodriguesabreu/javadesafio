package br.com.panvel.pilhas;
//Pilhas

/*
São estruturas de dados onde o elemento que está visível/disponível é o que
está sempre no topo.

Os elementos ao serem adicionados em uma pilha, são adicionados sempre no topo.

Para remover elementos da pilha, só podemos remover o topo.

O último elemento a entrar é o primeiro a sair.

[4] -> Tem visibilidade
[3]
[2]
[1]
[0]
*/
public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        System.out.println(pilha);

        pilha.insere("Maria");
        pilha.insere("João");
        pilha.insere("Marta");

        System.out.println(pilha);

        String r1 = pilha.remove();
        System.out.println(r1);

        System.out.println(pilha);
    }
}