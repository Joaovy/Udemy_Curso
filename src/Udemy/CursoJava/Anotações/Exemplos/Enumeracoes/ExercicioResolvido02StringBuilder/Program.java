package Udemy.CursoJava.Anotações.Exemplos.Enumeracoes.ExercicioResolvido02StringBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");

        Comentario c1 = new Comentario("Have nice trip!");
        Comentario c2 = new Comentario("Wow that's awesome");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Viajando para Nova Zelandia",
                "Vou visitar esse pais maravilhoso",
                12);

        p1.addComentario(c1);
        p1.addComentario(c2);

        System.out.println(p1);

        Comentario c3 = new Comentario("Boa noite!");
        Comentario c4 = new Comentario("Talvez eu te faça uma visita!");

        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"),
                    "Boa noite pessoal!",
                    "Vejo vocês amanha",
                    5);

        p2.addComentario(c3);
        p2.addComentario(c4);

        System.out.println(p2);


        scanner.close();
    }
}
