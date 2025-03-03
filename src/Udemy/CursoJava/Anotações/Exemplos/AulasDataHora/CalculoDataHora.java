package Udemy.CursoJava.Anotações.Exemplos.AulasDataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoDataHora {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        // Aqui estamos instanciando uma data menos 7 dias!
        LocalDate semanaPassadaLocalDate = d04.minusDays(7);
        LocalDate proximaSemana = d04.plusDays(7);

        System.out.println("Semana passada: "+ semanaPassadaLocalDate);
        System.out.println("Proxima semanda: "+ proximaSemana);

        LocalDateTime semanaPassadaLocalDateTime = d05.minusDays(7);
        LocalDateTime proximaSemanaTime = d05.plusDays(7);


        //----------------------------------------------------------------------------------


        System.out.println("Semana passada local date time: "+ semanaPassadaLocalDateTime);
        System.out.println("Proxima semanda local date time: "+ proximaSemanaTime);

        //----------------------------------------------------------------------------------

        Instant semanaPassadaInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant proximaSemanaInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("Semana passada instant time: "+ semanaPassadaInstant);
        System.out.println("Proxima semanda instant time: "+ proximaSemanaInstant);

        // tempo duração o tempo sera 7 dias entre as semanas
        Duration t1 = Duration.between(semanaPassadaLocalDate.atStartOfDay(), d04.atTime(0,0));
        // Acima o LocalDateTime não consegue fazer a soma com dias por isso é necessario fazer a conversão acima
        Duration t2 = Duration.between(semanaPassadaLocalDateTime, d05);
        Duration t3 = Duration.between(semanaPassadaInstant, d06);
        // Caso q queira fazer o calculo inverso ele dara o resultado negativo abaixo:
        Duration t4 = Duration.between(d06, semanaPassadaInstant);

        System.out.println("t1 dias = "+ t1.toDays());
        System.out.println("t2 dias = "+ t2.toDays());
        System.out.println("t3 dias = "+ t3.toDays());
        System.out.println("t4 dias = "+ t4.toDays());



    }
}
