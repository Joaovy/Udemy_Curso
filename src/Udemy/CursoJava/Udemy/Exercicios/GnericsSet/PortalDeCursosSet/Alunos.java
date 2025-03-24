package Udemy.CursoJava.Udemy.Exercicios.GnericsSet.PortalDeCursosSet;

import java.util.List;
import java.util.Objects;

public class Alunos {

    private List<Integer> codigoAluno;

    public Alunos(){

    }

    public Alunos(List<Integer> codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public List<Integer> getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(List<Integer> codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public void adionarAluno(Integer codigoAlunos){
        codigoAluno.add(codigoAlunos);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alunos alunos = (Alunos) o;
        return Objects.equals(codigoAluno, alunos.codigoAluno);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoAluno);
    }
}