package Udemy.CursoJava.Anotacoes.Exemplos.FuncoesJava;

import java.util.Scanner;

public class FuncoesSIntaxe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite 3 numeros: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maior = max(a, b, c);

        showResult(maior);

        scanner.close();
    }

    public static int max(int x, int y, int z){
        int aux;
        if(x > y && x > z){
            aux = x;
        }else if(y > z){
            aux = y;
        }else {
            aux = z;
        }

        return aux;
    }

    public static void showResult(int valor){
        System.out.println("Maior = "+ valor);
    }
}
