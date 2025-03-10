package Udemy.CursoJava.Anotacoes.Exemplos.MetodosAbstratos;

public class Retangulo extends Shape {

    private double largura;
    private double altura;

//    private Retangulo(){
//        super();
//    }

    public Retangulo(Color color, double largura, double altura) {
        super(color);
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return largura * altura;
    }

}
