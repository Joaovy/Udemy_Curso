package Udemy.CursoJava.Udemy.Exercicios.EstruturaCondicional;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int horaInicial, horaFinal, duracao;

        System.out.print("Informe a hora inicial do jogo: ");
        horaInicial = scanner.nextInt();

        System.out.print("Infome a hora final do jogo: ");
        horaFinal = scanner.nextInt();

        if(horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU "+ duracao +" HORA(S)");

        scanner.close();
    }
}
