package Udemy.CursoJava.Anotacoes.Exemplos.Generics.PrincipioGetPut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        // codigo simples para mostrar como é possivel utilizar o get e o put


        List<Integer> numerosInteiros = Arrays.asList(1, 2, 3, 4, 5);

        List<Double> numerosDouble = Arrays.asList(3.14, 2.55, 7.89);

        List<Object> meusObjetos = new ArrayList<Object>();


        copy(numerosInteiros, meusObjetos);

        printList(meusObjetos);

        copy(numerosDouble, meusObjetos);

        printList(meusObjetos);


    }

    // Criando um metodo para ler e adicionar utilizando o get/put
    public static void copy(List<? extends Number> source, List<? super Number> destiny){
        //Get
        for(Number number : source){
            //put
            destiny.add(number);
        }
    }

    public static void printList(List<?> list){
        for (Object obj : list){
            System.out.println(obj + " ");
        }
        System.out.println();
    }


}
