package Udemy.CursoJava.Anotacoes.Exemplos.Generics.Map;

import java.util.Map;
import java.util.TreeMap;

public class Demo1Cookies {

    public static void main(String[] args) {


        Map<String, String> cookies = new TreeMap<>();

        // chave e valor
        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "34 9927155");

        cookies.remove("email");

        // Como já existia um phone criado e o map não aceita reptições ele vai sobrescrever o valor
        cookies.put("phone", "34 08455655");


        System.out.println("Contains phone key: "+ cookies.containsKey("phone"));

        System.out.println("Phone number: "+ cookies.get("phone"));

        System.out.println("Email: "+ cookies.get("email"));

        System.out.println("Size: "+ cookies.size());

        System.out.println();
        System.out.println("ALL COOKIES");

        for(String key : cookies.keySet()){
            System.out.println(key + ": "+ cookies.get(key));
        }
    }

}
