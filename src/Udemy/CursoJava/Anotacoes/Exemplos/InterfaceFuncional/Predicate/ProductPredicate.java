package Udemy.CursoJava.Anotacoes.Exemplos.InterfaceFuncional.Predicate;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product product) {

        return product.getPrice() >= 100.0;
    }
}
