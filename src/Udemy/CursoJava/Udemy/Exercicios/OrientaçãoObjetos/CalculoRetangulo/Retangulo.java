package Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.CalculoRetangulo;

public class Retangulo {

    public double largura;
    public double altura;

    public double areaRetangulo(){
        return largura * altura;
    }

    public double perimetroRetangulo(){
        return 2 * (largura + altura);
    }

    public double diagonalRetangulo(){
        return Math.sqrt(( largura * largura) + (altura * altura));
    }
}
