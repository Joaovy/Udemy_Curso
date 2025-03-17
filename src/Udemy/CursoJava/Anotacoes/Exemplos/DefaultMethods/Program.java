package Udemy.CursoJava.Anotacoes.Exemplos.DefaultMethods;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantia: ");
        double quantia = scanner.nextDouble();

        System.out.println("Meses: ");
        int meses = scanner.nextInt();

        InterestService usaIs = new UsaInterestService(1.0);
        double payment = usaIs.payment(quantia,meses);

        System.out.println("Apos o pagamento: "+ meses + " Meses:");
        System.out.println(String.format("%.2f", payment));

        scanner.close();
    }
}
