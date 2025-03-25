package Udemy.CursoJava.Anotacoes.Exemplos.InterfaceFuncional.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        // exemplo com função map

        /*  PROBLEMA EXEMPLO
            Fazer um programa que, a partir de uma lista de produtos, gere uma
            nova lista contendo os nomes dos produtos em caixa alta.
         */

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //Implementação da interface
        // map neste caso vai aplicar a função a cada elemento da lista
        // lembrando que a função map só funciona para stream por isso é feita uma conversão
        //List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        //names.forEach(System.out::println);

        //Reference method com metodo estatico
        //List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
        //names.forEach(System.out::println);

        //Reference method com metodo nao estatico
        //List<String> names = list.stream().map(Product::naoStaticUpperCaseName).collect(Collectors.toList());
        //names.forEach(System.out::println);

        //Expressão lambda declarada
        Function<Product, String> func = p -> p.getName().toUpperCase();
        List<String> names = list.stream().map(func).collect(Collectors.toList());
        names.forEach(System.out::println);

    }


}
