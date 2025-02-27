package Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.ExercicioArrayListEmploye;

public class Funcionario {

    private final int id;
    private String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void adicionarPorcentagem( double porcentagem){
        this.salario += salario * (porcentagem / 100);
    }

    @Override
    public String toString() {
        return id + ", "+ nome +", "+ String.format("%.2f%n", salario);
    }
}
