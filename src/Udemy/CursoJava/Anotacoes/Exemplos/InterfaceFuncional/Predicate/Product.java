package Udemy.CursoJava.Anotacoes.Exemplos.InterfaceFuncional.Predicate;

public class Product {

    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static boolean staticProductPredicate(Product p){
        // metodo estatico trabalha com produto que você passar pra ele
        return p.getPrice() >= 100.0;
    }

    public boolean naoStaticProductPredicate(){
        return price >= 100.0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
