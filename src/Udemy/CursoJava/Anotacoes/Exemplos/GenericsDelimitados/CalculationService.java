package Udemy.CursoJava.Anotacoes.Exemplos.GenericsDelimitados;

import java.util.List;

public class CalculationService {

    public static <T extends  Comparable<T>> T max (List<T> list){

        if(list.isEmpty()){
            throw new IllegalStateException("Lista não pode estar vazia!");
        }
        T max = list.get(0);
        for( T item : list){
            if(item.compareTo(max) > 0){
                max = item;
            }
        }


        return max;
    }

}
