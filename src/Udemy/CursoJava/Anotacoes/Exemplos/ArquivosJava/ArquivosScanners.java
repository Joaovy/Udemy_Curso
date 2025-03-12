package Udemy.CursoJava.Anotacoes.Exemplos.ArquivosJava;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ArquivosScanners {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\joao\\OneDrive\\Documents\\GitHub\\AulaArquivoJava.txt");
        Scanner scanner = null;

        try{
            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.err.println("Erro: "+ e.getMessage());

        }
        finally {

            if(scanner != null){
                scanner.close();

            }

        }

    }

}
