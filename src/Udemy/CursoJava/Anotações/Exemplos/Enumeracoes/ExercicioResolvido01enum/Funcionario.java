package Udemy.CursoJava.Anotações.Exemplos.Enumeracoes.ExercicioResolvido01enum;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Funcionario {

    private String name;
    private WorkLevel nivel;
    private double salarioBase;

    private Departamento departamento;
    private List<ContratoHora> contratos = new ArrayList<>();
    //quando temos uma lista não colocamos no construtor e você deve iniciar ela logo acima
    

    public Funcionario(Departamento departamento, double salarioBase, WorkLevel nivel, String name) {
        this.departamento = departamento;
        this.salarioBase = salarioBase;
        this.nivel = nivel;
        this.name = name;
    }

    public List<ContratoHora> getContratos() {
        return contratos;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public WorkLevel getNivel() {
        return nivel;
    }

    public void setNivel(WorkLevel nivel) {
        this.nivel = nivel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addContrato(ContratoHora contrato){
        contratos.add(contrato);
    }

    public void removeContrato(ContratoHora contrato){
        contratos.remove(contrato);
    }

    public double income(int ano, int mes){
        double soma = salarioBase;
        Calendar cal = Calendar.getInstance();

        for (ContratoHora c : contratos) {
            cal.setTime(c.getDate());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
            if(ano == c_ano && mes == c_mes){
                soma += c.totalValor();
            }


        }

        return soma;
    }


}
