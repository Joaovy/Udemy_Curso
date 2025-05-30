package Udemy.CursoJava.Anotacoes.Exemplos.InterfaceFuncional.Consumer;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {
    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
