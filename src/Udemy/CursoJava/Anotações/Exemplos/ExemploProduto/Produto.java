package Udemy.CursoJava.Anotações.Exemplos.ExemploProduto;

public class Produto {

    public String name;
    public double preco;
    public int quantidade;

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
