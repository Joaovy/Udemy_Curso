package Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.VerificacaoDaNotaAluno;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VerificaNota {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno a1 = new Aluno();

        System.out.print("Informe o nome do aluno a seguir informe as notas: ");
        a1.nome = scanner.nextLine();

        a1.nota1 = scanner.nextDouble();
        a1.nota2 = scanner.nextDouble();
        a1.nota3 = scanner.nextDouble();

        System.out.printf("Valor final: %.2f%n", a1.retornaSomaDasNotas());

        if(a1.retornaSomaDasNotas() < 60.0){
            System.out.println("REPROVADO");
            System.out.printf("FALTANDO: %.2f%n", a1.verificaRestante());
        }else {
            System.out.println("APROVADO");
        }


        scanner.close();
    }
}
