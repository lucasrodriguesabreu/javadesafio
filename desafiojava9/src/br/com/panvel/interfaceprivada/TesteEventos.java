package br.com.panvel.interfaceprivada;

public class TesteEventos {
    public static void main(String[] args) {
        LogEventosI log = new LogEventosI() {
        };
        log.logError("A conexão falhou!");
    }
}