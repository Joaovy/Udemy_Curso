package Udemy.CursoJava.Anotacoes.Exemplos.VetorComClasseProduto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaArrayList {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        // Adicionando elementos na lista:
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("Joao");
        list.add("Nathan");
        list.add("Ana Maria");


        // Esse metodo adiciona na posição infiormada e utiliza dois argumentos
        list.add(2, "Marcos");

        //Imprimindo o tamanho da lista:
        System.out.println(list.size());

        for(String x : list){
            System.out.println(x);
        }

        System.out.println("--------------------------------------");

        //Removendo um elemento da lsita:
        list.remove("Anna");
        // esta anna não é o mesmo elemento a lista faz apenas uma comparação e remove

        // removendo por um numero ( posição do elemento!
        list.remove(1);

        // removendo por um predicado
        list.removeIf(x -> x.charAt(0) == 'M');

        for(String x : list){
            System.out.println(x);
        }

        System.out.println("--------------------------------------");

        //Encontrando um elemento pelo index:
        System.out.println("INdex of bob: "+ list.indexOf("Bob"));
        // Atenção quando o index of não encontra um elemento ele retorna o numero negativo ou -1

        System.out.println("--------------------------------------");

        // Caso eu queria retornar uma lista com os nomes que começam com A?
        // é necessario criar outra lista e converter para um filtro e fazer a operação lambda depois converter novamente o filtro para array
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for(String x : result){
            System.out.println(x);
        }

    }
}
