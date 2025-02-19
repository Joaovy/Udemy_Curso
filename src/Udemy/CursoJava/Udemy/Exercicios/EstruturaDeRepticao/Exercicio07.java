package Udemy.CursoJava.Udemy.Exercicios.EstruturaDeRepticao;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 1; i <= N; i++){

            int primeiroNUmero = i;
            int segundoNumero = i * i;
            int terceiroNumero = i * i * i;

            System.out.println( primeiroNUmero +" "+ segundoNumero +" "+ terceiroNumero);
        }
    }
}
