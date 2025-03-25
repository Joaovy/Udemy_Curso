package Udemy.CursoJava.Anotacoes.Exemplos.InterfaceFuncional.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {

    public static void main(String[] args) {

        /*  PROBLEMA EXEMPLO
        Fazer um programa que, a partir de uma lista de produtos, remova da
        lista somente aqueles cujo preço mínimo seja 100.
         */

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // jeito convencional
        //list.removeIf(p -> p.getPrice() >= 100);

        //Implementação da Interface 1°
        //list.removeIf(new ProductPredicate());

        //Reference Method com metodo estatico 2°
        //list.removeIf(Product::staticProductPredicate);

        //Reference method com metodo nao estatico
        //list.removeIf(Product::naoStaticProductPredicate);

        //Expressão lambda declarada
        //Predicate<Product> pred = p -> p.getPrice() >= 100.0;
        //list.removeIf(pred);

        //Expressão lambda inline
        double min = 100.0;
        list.removeIf(p -> p.getPrice() >= min);

        for (Product p : list){
            System.out.println(p);
        }
    }

}
