package Udemy.CursoJava.Anotacoes.Exemplos.InterfaceFuncional.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {

    public static void main(String[] args) {

        /*
        PROBLEMA EXEMPLO
        Fazer um programa que, a partir de uma lista de produtos, aumente o
        preço dos produtos em 10%
         */

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Implementação da interface 1°
        //list.forEach(new PriceUpdate());
        //list.forEach(System.out::println);

        //Reference method com metodo estatico 2°
        //list.forEach(Product::staticPriceUpdate);
        //list.forEach(System.out::println);

        //Reference method com metodo nao estatico 3°
        //list.forEach(Product::naoStaticPriceUpdate);
        //list.forEach(System.out::println);

        //Expressão lambda declarada 4°
        Consumer<Product> consumer = p -> {
             p.setPrice(p.getPrice() * 1.1);
        };
        list.forEach(consumer);
        list.forEach(System.out::println);
    }

}
