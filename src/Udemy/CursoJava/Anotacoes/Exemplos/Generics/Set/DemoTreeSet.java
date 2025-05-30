package Udemy.CursoJava.Anotacoes.Exemplos.Generics.Set;

import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {

    public static void main(String[] args) {

        // Para que o o treeSet funcione sua classe produto tem que ter
        // uma implementação do comparable
        Set<Product> set = new TreeSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        for (Product p : set) {
            System.out.println(p);
        }


    }

}
