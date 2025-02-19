package Udemy.CursoJava.Anotações.Exemplos;

import java.util.Scanner;

public class AtribuicaoAcomulativa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ;
        Scanner sc = new Scanner(System.in);
        int minutos = sc.nextInt();
        double conta = 50.0;
        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }
        System.out.printf("Valor da conta = R$ %.2f%n", conta);
        sc.close();
    }
}
