package Udemy.CursoJava.Anotacoes.Exemplos.EqualsHasCode;

public class Programtest {

    public static void main(String[] args) {


        Client c1 = new Client("Maria", "maria01@gmail.com");
        Client c2 = new Client("Maria", "maria01@gmail.com");


        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

        System.out.println(c1 == c2);
        // o == vai comparar as referencias de memoria
        // e não o conteudo!


        String s1 = "test";
        String s2 = "test";
        System.out.println(s1 == s2);
        // neste caso em especifico o compilador vai dar um tratamento espećial e o resultado vai ser true
    /*

    Equals

        String a = "Maria";
        String b = "Alex";

        System.out.println(a.equals(b));



    HashCode

        String a = "Maria";
        String b = "Alex";

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());


     */
    }

}
