package Udemy.CursoJava.Anotacoes.Exemplos.HerdarVsContrato.Model.entities;

import Udemy.CursoJava.Anotacoes.Exemplos.HerdarVsContrato.Model.enums.Color;

public class Circle extends AbstractShape {

    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area(){
        return  Math.PI * radius * radius;
    }
}
