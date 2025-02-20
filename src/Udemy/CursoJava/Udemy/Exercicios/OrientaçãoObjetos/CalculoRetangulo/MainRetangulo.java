package Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.CalculoRetangulo;

import java.util.Scanner;

public class MainRetangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Retangulo r1 = new Retangulo();
        
        System.out.println("Informe os dados do retangulo, altura e largura: ");
        r1.altura = scanner.nextDouble();
        r1.largura = scanner.nextDouble();
        
        double resultadoArea = r1.areaRetangulo();
        double resulatdoPerimetro = r1.perimetroRetangulo();
        double resultadoDiagnoal = r1.diagonalRetangulo();

        System.out.printf("AREA = %.2f", resultadoArea);
        System.out.println();
        System.out.printf("PERIMETRO = %.2f", resulatdoPerimetro);
        System.out.println();
        System.out.printf("DIAGONAL = %.2f", resultadoDiagnoal);


        scanner.close();
    }
}
