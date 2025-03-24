package Udemy.CursoJava.Udemy.Exercicios.LeituraLogUsandoSet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LendoArquivoLog {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o caminho do arquivo: ");
        String path = scanner.nextLine();

        // ABrindo o arquivo e lendo:
        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            Set<LogEntry> set = new HashSet<>();

            //  recortando
            String line = br.readLine();
            while (line != null){
                // Usando o split para recortar os dados e transformando em vetor
                String[] fileds = line.split(" ");


                String username = fileds[0];
                Date moment = Date.from(Instant.parse(fileds[1]));

                set.add(new LogEntry(username, moment));

                line = br.readLine();

            }

            System.out.println("Total user: "+ set.size());

        } catch (IOException e){
            System.err.println("Error: "+ e.getMessage());

        }


        scanner.close();
    }

}
