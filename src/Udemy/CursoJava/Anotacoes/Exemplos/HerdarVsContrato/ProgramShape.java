package Udemy.CursoJava.Anotacoes.Exemplos.HerdarVsContrato;

import Udemy.CursoJava.Anotacoes.Exemplos.HerdarVsContrato.Model.entities.AbstractShape;
import Udemy.CursoJava.Anotacoes.Exemplos.HerdarVsContrato.Model.entities.Circle;
import Udemy.CursoJava.Anotacoes.Exemplos.HerdarVsContrato.Model.entities.Rectangle;
import Udemy.CursoJava.Anotacoes.Exemplos.HerdarVsContrato.Model.enums.Color;

public class ProgramShape {

    public static void main(String[] args) {

        AbstractShape shape1 = new Circle(Color.BLACK, 2.0);
        AbstractShape shape2 = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + shape1.getColor());
        System.out.println("Circle area: " + String.format("%.3f", shape1.area()));
        System.out.println("Rectangle color: " + shape2.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", shape2.area()));


    }

}
