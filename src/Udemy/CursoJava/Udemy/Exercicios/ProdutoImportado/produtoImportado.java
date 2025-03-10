package Udemy.CursoJava.Udemy.Exercicios.ProdutoImportado;

public class produtoImportado extends Produto{

    private double taxaAlfandega;

    public produtoImportado(String name, double preco, double taxaAlfandega) {
        super(name, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    public double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }

    @Override
    public String precotag(){
       // double totalTaxaImportada = taxaAlfandega + getPreco();
        return getName() + " " + String.format("%.2f", precoTotal()) + " ( Taxa alfandega: $"+ taxaAlfandega + ")";
    }

    public double precoTotal(){
        return taxaAlfandega + getPreco();
    }

}
