package Udemy.CursoJava.Anotacoes.Exemplos.ExercicioResolvidoPolimorfismo;

public class FuncionarioTercerizado extends Funcionario {

    private double adicional;


    public FuncionarioTercerizado(String name, int hours, double valuePerHour, double adicional) {
        super(name, hours, valuePerHour);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    @Override
    public double payment(){
        return  super.payment() + adicional * 1.1;
    }
}
