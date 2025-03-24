package Udemy.CursoJava.Udemy.Exercicios.GenericsMap.ContagemDeVotos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LeituraVotos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o caminho do arquivo: ");
        String path = scanner.nextLine();

        Map<String, Integer> registros = new HashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while(line != null){

                String[] fileds = line.split(",");
                String nomeCandidato = fileds[0];
                Integer votoCandidato = Integer.valueOf(fileds[1]);

                registros.put(nomeCandidato, registros.getOrDefault(nomeCandidato, 0) + votoCandidato);

                line = br.readLine();

            }

        } catch (IOException e) {
            System.out.println("Error: "+ e.getMessage());

        }

        for (String key : registros.keySet()){
            System.out.println(key + ": "+ registros.get(key));
        }

        scanner.close();
    }

}
