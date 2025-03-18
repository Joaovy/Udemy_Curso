package Udemy.CursoJava.Anotacoes.Exemplos.Generics;

import java.util.Scanner;

public class ProgramPrint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService();

        System.out.print("Quantos valores?: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            ps.addValue(value);
        }

        ps.print();
        int x = ps.first();
        System.out.println("First: "+ x);
        scanner.close();
    }

}
