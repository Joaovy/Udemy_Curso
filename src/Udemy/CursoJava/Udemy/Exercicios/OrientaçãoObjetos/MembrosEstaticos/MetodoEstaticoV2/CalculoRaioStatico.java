package Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.MembrosEstaticos.MetodoEstaticoV2;

public class CalculoRaioStatico {
    public static final double PI = 3.14159;

    public static double circumFerencia(double raio){
        return 2.0 * PI * raio * raio * raio / 3.0;
    }

    public static double volume(double raio){
        return 4.0 * PI * raio  * raio * raio / 3.0;
    }
}
