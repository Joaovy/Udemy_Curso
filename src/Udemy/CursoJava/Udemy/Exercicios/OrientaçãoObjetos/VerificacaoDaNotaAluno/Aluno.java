package Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.VerificacaoDaNotaAluno;

public class Aluno {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double retornaSomaDasNotas(){
        return nota1 + nota2 + nota3;
    }

    public double verificaRestante(){

        if(retornaSomaDasNotas() < 60.0){
            return 60.0 - retornaSomaDasNotas();
        } else {
            return 0.0;
        }

    }

}
