package br.com.panvel.modulescustom;

import br.com.panvel.modules.goodbye.GoodBye;
import br.com.panvel.modules.hello.Hello;

public class ModulesCustom {
    public static void main(String[] args) {
        Hello hello = new Hello();

        hello.diga();

        GoodBye bye = new GoodBye();

        bye.diga();
    }
}