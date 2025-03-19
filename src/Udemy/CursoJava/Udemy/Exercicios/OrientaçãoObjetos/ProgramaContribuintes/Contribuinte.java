package Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.ProgramaContribuintes;

public  abstract class Contribuinte {

    private String nomes;
    private double rendaAnual;

    public Contribuinte(String nomes, double rendaAnual) {
        this.nomes = nomes;
        this.rendaAnual = rendaAnual;
    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    //Metodo abstrato
    public abstract double tax();

}
