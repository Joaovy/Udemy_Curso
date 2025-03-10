package Udemy.CursoJava.Anotacoes.Exemplos.MetodosAbstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("INsira o numero de formas: ");
        int numeroFormas = scanner.nextInt();

        List<Shape> list = new ArrayList<>();

        for(int i = 1; i <= numeroFormas; i++){

            System.out.println("Forma: #"+ i);
            System.out.print("Retangulo ou circulo?: ");
            char verificaForma = scanner.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(scanner.next());

            if(verificaForma == 'r'){
                System.out.print("Largura: ");
                double larguraForma = scanner.nextDouble();
                System.out.print("Altura: ");
                double alturaForma = scanner.nextDouble();
                Shape retangulo1 = new Retangulo(color, larguraForma, alturaForma);
                list.add(retangulo1);

            } else {
                System.out.print("Raio: ");
                double raioCirculo = scanner.nextDouble();
                Shape circulo1 = new Circulo(color, raioCirculo);
                list.add(circulo1);

            }

        }

        System.out.println();
        System.out.println("SHAPE AREAS");
        for(Shape shape: list){
            System.out.println(String.format("%.2f",shape.area()));
        }





        scanner.nextLine();
    }
}
