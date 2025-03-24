package Udemy.CursoJava.Anotacoes.Exemplos.Generics.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class ProgramDemo1 {

    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        set.removeIf(x -> x.charAt(0) == 'T');

        for (String p : set) {
            System.out.println(p);
        }

    }

}
