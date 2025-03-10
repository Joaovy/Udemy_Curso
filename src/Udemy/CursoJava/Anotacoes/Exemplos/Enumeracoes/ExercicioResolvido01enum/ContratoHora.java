package Udemy.CursoJava.Anotacoes.Exemplos.Enumeracoes.ExercicioResolvido01enum;

import java.util.Date;

public class ContratoHora {

    private Date date;
    private double valorPorHora;
    private int hora;

    public ContratoHora(){

    }
    public ContratoHora(Date date, double valorPorHora, int hora) {
        this.date = date;
        this.valorPorHora = valorPorHora;
        this.hora = hora;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public double totalValor(){
        return valorPorHora * hora;
    }
}
