package Udemy.CursoJava.Udemy.Exercicios.ProgramaContribuintes;

public class Company extends Contribuinte{

    private int numerosFuncionarios;

    public Company(String nomes, double rendaAnual, int numerosFuncionarios) {
        super(nomes, rendaAnual);
        this.numerosFuncionarios = numerosFuncionarios;
    }

    public int getNumerosFuncionarios() {
        return numerosFuncionarios;
    }

    public void setNumerosFuncionarios(int numerosFuncionarios) {
        this.numerosFuncionarios = numerosFuncionarios;
    }


    @Override
    public double tax() {
        double taxa;

        if(numerosFuncionarios > 10){
            taxa = 0.14;
        } else {
            taxa = 0.16;
        }

        return getRendaAnual() * taxa;
    }
}
