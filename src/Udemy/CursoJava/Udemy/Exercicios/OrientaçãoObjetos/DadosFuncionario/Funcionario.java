package Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.DadosFuncionario;

public class Funcionario {

    public String nome;
    public double salario;
    public double taxa;

    public double impostoSobreSalario(){
        return salario - taxa;
    }

    public void bonusSalario(double porcentagem){
        salario += salario *  porcentagem / 100.0;
    }

    public String toString(){

        return nome +", R$"+ String.format("%.2f", impostoSobreSalario());
    }
}
