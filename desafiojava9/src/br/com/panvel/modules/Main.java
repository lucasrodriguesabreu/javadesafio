package br.com.panvel.modules;

import br.com.panvel.modules.goodbye.GoodBye;
import br.com.panvel.modules.hello.Hello;

public class Main {
    public static void main(String[] args) {
        Hello hello = new Hello();

        hello.diga();

        GoodBye bye = new GoodBye();

        bye.diga();
    }
}