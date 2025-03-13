package Udemy.CursoJava.Anotacoes.Exemplos.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BlocoTryCatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        metodo1();

        System.out.println("Fim do programa!");

        /* A exceção a ser tratada aqui vai ser quando voce digitar a posição que deseja
        e por acaso digitar um caracter ex: 'A' o programa dara um erro e vai parar o programa e finalizar 'ArrayIndexOutOfBoundsException'
         outro tipo de exceção vai ser quando o digitar uma posição invalida!
         */
        scanner.close();
    }

    public static  void metodo1(){
        System.out.println("**** METODO 1 START ***");

        metodo2();

        System.out.println("**** METODO 1 END ***");

    }

    public static  void metodo2(){
        System.out.println("**** METODO 2 START ***");
        Scanner scanner = new Scanner(System.in);

        try{
            String[] vet = scanner.nextLine().split(" ");
            int posicao = scanner.nextInt();
            System.out.println(vet[posicao]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Posição invalida");
            e.printStackTrace();
            scanner.next();
        }
        catch (InputMismatchException e){
            System.err.println("Input erro");
        }
        System.out.println("*** METODO 2 END ***");
        scanner.close();
    }

}
