package Udemy.CursoJava.Anotacoes.Exemplos.Generics.Set;
import java.util.HashSet;
import java.util.Set;
public class Demo3 {

    public static void main(String[] args) {

        Set<Product> set = new HashSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));


        Product prod = new Product("Notebook", 1200.0);

        System.out.println(set.contains(prod));
        // Ela vai dar falso pois não tem essa implementação
        // neste caso o compilador compara pelo ponteiros


        // apos criar o equals e o hascode ele dara true!!!!
    }

}
