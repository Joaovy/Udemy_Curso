package Udemy.CursoJava.Udemy.Exercicios;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FixacaoPrintf {
    public static void main(String[] args) {

//        int y = 20;
//        double x = 10.35784;
//
//        System.out.println("o valor é: "+ y);
//
//        System.out.printf("%.2f%n", x);
//        Locale.setDefault(Locale.US);
//        // formatação em numero flutuante!!!

        // Exercicio de fixação:

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products: ");
        System.out.printf("%s, which price is R$ %.2f\n", product1, price1);
        System.out.printf("%s, which price is $ %.2f", product2, price2);

        System.out.println("Record: "+ age +"years old, code "+ code +" and gender: "+ gender);
        System.out.printf("Measue with eight decimal places: %.8f\n", measure);
        System.out.printf("Rouded (three decimal places): %.4f\n", measure);
        System.out.println("US decimal point: "+ measure);
    }
}