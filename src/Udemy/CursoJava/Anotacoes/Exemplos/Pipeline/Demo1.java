package Udemy.CursoJava.Anotacoes.Exemplos.Pipeline;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Demo1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
        Stream<Integer> st1 = list.stream().map(x -> x * 10);

        System.out.println(Arrays.toString(st1.toArray()));

        // Operação que faz o somatorio da minha lista
        int sum = list.stream().reduce(0, (x, y) -> x + y);
        // Reduce é uma operação terminal

        System.out.println("Sum = " + sum);

        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0) // filtrando minha lista apenas por pares
                .map(x -> x * 10) // convertendo em stream e multiplicando por 10
                .collect(Collectors.toList()); // convertendo minha stream para uma lista
        System.out.println(Arrays.toString(newList.toArray()));


    }
}
