package br.com.panvel.interfaceprivada;
/*
No Java8 já era possível utilizar a interface como default
 */

public interface LogEventosI {

    default void logInfo(String mensagem){
        log(mensagem, "INFO");
    }
    default void logWarn(String mensagem){
        log(mensagem, "WARN");
    }
    default void logError(String mensagem){
        log(mensagem, "ERROR");
    }
    default void logFatal(String mensagem){
        log(mensagem, "FATAL");
    }
    //NEW FEATURE JAVA 9 AQUI
    private void log(String mensagem, String tipo){
        System.out.println("Início da mensagem");
        System.out.println(tipo + ": " + mensagem);
        System.out.println("Fim da mensagem");
    }
}