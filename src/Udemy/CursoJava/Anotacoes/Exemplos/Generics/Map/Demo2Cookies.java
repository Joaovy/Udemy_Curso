package Udemy.CursoJava.Anotacoes.Exemplos.Generics.Map;

import java.util.HashMap;
import java.util.Map;

public class Demo2Cookies {

    public static void main(String[] args) {

        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        // Para o map comparar o elemento de chave ele precisa do equals e o hashCode
        // Se não ele vai comparar pelo ponteiro
        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product ps = new Product("Tv", 900.0);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

    }
}
