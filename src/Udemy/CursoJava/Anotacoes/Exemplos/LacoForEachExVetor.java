package Udemy.CursoJava.Anotacoes.Exemplos;

public class LacoForEachExVetor {

    public static void main(String[] args) {

        String[] vetor = new String[] {"Maria", "Joao", "Alex"};

        // Laço de reptição normal feito até agora com os exemplos!
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("-------------------------------");
        // Laço for each
        for (String obj : vetor){
            System.out.println(obj);
        }

    }
}
