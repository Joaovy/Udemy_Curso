package Udemy.CursoJava.Anotações.Exemplos.AulasDataHora;

import java.sql.SQLOutput;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class AulaConversao {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        // Conversão para o timZone
        // Ele vai retornar o dia 19 pois o dia em londres é 1:30 da manha
        // ou seja ele pega 3 horas antes informa o dia!
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        // Portugal e 2 horas antes por isso ainda é dia 20
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("r1 = "+ r1);
        System.out.println("r2 = "+ r2);

        // Pegando dias especificos da data:
        System.out.println("d04 dia = "+ d04.getDayOfMonth());
        System.out.println("d04 dia = "+ d04.getMonthValue());
        System.out.println("d04 dia = "+ d04.getYear());



    }
}
