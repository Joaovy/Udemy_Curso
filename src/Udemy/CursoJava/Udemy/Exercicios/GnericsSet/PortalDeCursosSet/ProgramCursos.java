package Udemy.CursoJava.Udemy.Exercicios.GnericsSet.PortalDeCursosSet;

import java.util.*;


public class ProgramCursos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer code;
        Set<Integer> alunoCursos = new HashSet<>();

        System.out.print("Quantos alunos estão no curso A?: ");
        int students = scanner.nextInt();
        for(int i = 0;i < students; i++){

            code = scanner.nextInt();
            alunoCursos.add(code);

        }

        System.out.print("Quantos alunos estão no curso B?: ");
        students = scanner.nextInt();
        for(int i = 0;i < students; i++){

            code = scanner.nextInt();
            alunoCursos.add(code);

        }

        System.out.print("Quantos alunos estão no curso C?: ");
        students = scanner.nextInt();
        for(int i = 0;i < students; i++){

            code = scanner.nextInt();
            alunoCursos.add(code);

        }


        System.out.println("Total de estudantes: "+ alunoCursos.size());


        scanner.close();
    }


}
