package Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.ExemploProdutoConstrutor;

public class Produto {

    private String name;
    private double preco;
    private int quantidade;

    //Construtor Padrão
    public Produto(){
    }

    // Construtor
    public Produto(String name, double preco, int quantidade){
        // quando é chamado o this.name ele esta se referenciando ao atributo do objeto!!
        this.name = name;
        this.quantidade = quantidade;
        this.preco = preco;

    }

    // Sobrecarga
    public Produto(String name, double preco){
        this.name = name;
        this.preco = preco;
    }

    // Encapsulamento:
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public int getQuantidade(){
        return quantidade;
    }




    public double valorTotal(){
        return quantidade * preco;
    }

    public void addProdutos(int quantidade){
        this.quantidade += quantidade;
    }

    public void removeProdutos(int quantidade){
        this.quantidade -= quantidade;
    }

    // Aqui ele esta fazendo uma subreposição
    public String toString(){
       return name + ", $ "+ String.format("%.2f", preco) +", "+ quantidade +" unidades, total: R$"+ String.format("%.2f", valorTotal());
    }
}
