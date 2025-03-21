package Udemy.CursoJava.Anotacoes.Exemplos.HerdarVsContrato.Model.entities;

import Udemy.CursoJava.Anotacoes.Exemplos.HerdarVsContrato.Model.enums.Color;

public abstract class AbstractShape implements Shape {

    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
