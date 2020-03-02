package br.com.panvel.streams;

import java.util.ArrayList;
import java.util.List;

/*
- Streams são fluxos de dados/objetos utilizados para que possamos
trabalhar com esses dados de forma mais criteriosa.

- Quando trabalhamos com stream, os métodos aplicados a este stream
não afetam a coleção original.
 */
public class Main {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Programação para Leigos", 170));
        cursos.add(new Curso("Programação em Angular", 280));
        cursos.add(new Curso("Programação com Springboot", 125));
        cursos.add(new Curso("Programação em Python", 0));
        cursos.add(new Curso("Programação em Java", 0));

        //Como fazer para imprimir somente os cursos com mais de 100 alunos?
        cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(System.out::println);

    }
}
