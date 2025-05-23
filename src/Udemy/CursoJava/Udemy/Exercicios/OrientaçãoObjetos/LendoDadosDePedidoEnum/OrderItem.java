package Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.LendoDadosDePedidoEnum;

public class OrderItem {

    private int quantidade;
    private double preco;
    private Produto produto;

    public OrderItem(){

    }

    public OrderItem(int quantidade, double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double subtotal(){
        return preco * quantidade;
    }

}
