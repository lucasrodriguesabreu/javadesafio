package br.com.panvel.date;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje); ///formato ISO (internacional)

        //Formatando uma data
        LocalDate ano_novo = LocalDate.of(2021, Month.JANUARY, 1);
        System.out.println(ano_novo);//Formato iso (internacional)

        int ano = ano_novo.getYear();
        Month mes = ano_novo.getMonth();
        int dia = ano_novo.getDayOfMonth();

        System.out.println("O ano novo será em " + dia + " de " + mes + " de " + ano + ".");
        //Para saber quanto tempo falta até o novo novo
        Period periodo = Period.between(hoje, ano_novo);
        System.out.println(periodo);

        System.out.println("Faltam " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias para o ano novo.");
        //Deixando no formato Brasileiro.
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(hoje.format(formatador));
        //Formato ISO (internacional)
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);

        //Deixando o horário no formato Brasileiro.
        DateTimeFormatter formatador_horas = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(agora.format((formatador_horas)));
        //Usando um exemplo para definir um horário, por exemplo, almoço
        LocalTime intervalo = LocalTime.of(11, 30);
        System.out.println("O horário do almoço é " + intervalo + ".");
    }
}