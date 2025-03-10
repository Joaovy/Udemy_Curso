package Udemy.CursoJava.Anotacoes.Exemplos.MetodosAbstratos;

public abstract class Shape {

    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    //METODO ABSTRATO
    public abstract double area();

}
