package Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.TrianguloComClasse;


// estilo de projeto UML

public class Triangulo {

    public double a;
    public double b;
    public double c;


    /* Aqui o metodo area não recebe nenhum valor nos parametros ()
    pois ele usa as proprias variaveis que estão na classe, no caso a, b e C.
     */
    public double area(){
        double p = (a + b + c) / 2.0;
        double result = Math.sqrt(p * (p - a) * (p - b) *  (p - c));

        return result;
    }
}
