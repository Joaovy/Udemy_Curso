package Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.ProgramaContribuintes;

public class Individual extends Contribuinte{

    private double despesaDeSaude;

    public Individual(String nomes, double rendaAnual, double despesaDeSaude) {
        super(nomes, rendaAnual);
        this.despesaDeSaude = despesaDeSaude;
    }

    public double getDespesaDeSaude() {
        return despesaDeSaude;
    }

    public void setDespesaDeSaude(double despesaDeSaude) {
        this.despesaDeSaude = despesaDeSaude;
    }

    @Override
    public double tax() {
        double impostoBase;

        if(getRendaAnual() < 20000){
            impostoBase = getRendaAnual() * 0.15;
        } else {
            impostoBase = getRendaAnual() * 0.25;
        }

        double descontoSaude = despesaDeSaude * 0.50;
        double impostoFinal = impostoBase - descontoSaude;

        return (impostoFinal > 0) ? impostoFinal : 0.0;

    }
}
