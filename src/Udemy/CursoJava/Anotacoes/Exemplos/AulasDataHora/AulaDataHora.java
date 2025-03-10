package Udemy.CursoJava.Anotacoes.Exemplos.AulasDataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AulaDataHora {
    public static void main(String[] args) {


        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");


        /* Formatção texto formado customizado > Data - hota utilizando o
        date formetter
         */
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("03/03/2025", fmt1);

        // Opção com time!
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("20/07/2025 01:30", fmt2);

        // Utilizando a opção of
        LocalDate d10 = LocalDate.of(2025, 3, 3);
        LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);


        /* Lembrando que implicitamente eu estou chamando meu toString no meu obejto
        no println, e lembrando que todos estão no padrão ISO 8601!!!!
         */
        System.out.println("d01 = "+ d01);
        System.out.println("d02 = "+ d02);
        System.out.println("d03 = "+ d03);
        System.out.println("d04 = "+ d04);
        System.out.println("d05 = "+ d05);
        System.out.println("d06 = "+ d06);
        System.out.println("d07 = "+ d07);
        System.out.println("d08 = "+ d08);
        System.out.println("d09 = "+ d09);
        System.out.println("d10 = "+ d10);
        System.out.println("d11 = "+ d11);



    }
}
