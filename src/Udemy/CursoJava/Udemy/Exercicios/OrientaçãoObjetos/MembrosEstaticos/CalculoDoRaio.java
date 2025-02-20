package Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.MembrosEstaticos;

public class CalculoDoRaio {

    public static final double PI = 3.14159;

    public static double circumFerencia(double raio){
        return 2.0 * PI * raio * raio * raio / 3.0;
    }

    public double volume(double raio){
        return 4.0 * PI * raio  * raio * raio / 3.0;
    }

}
