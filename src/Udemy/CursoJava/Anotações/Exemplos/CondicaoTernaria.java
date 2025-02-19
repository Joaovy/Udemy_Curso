package Udemy.CursoJava.Anotações.Exemplos;

public class CondicaoTernaria {

    public static void main(String[] args) {

        /* Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma
           condição.
Sintaxe:
( condição ) ? valor_se_verdadeiro : valor_se_falso

         */
//          forma tradicional de ser feita a codição:
//        double preco = 34.5;
//        double desconto;
//        if (preco < 20.0) {
//            desconto = preco * 0.1;
//        }
//        else {
//            desconto = preco * 0.05;
//        }

        // feito com codição ternaria, tudo que estiver ao lado da interrogação sera a verdade nesse
        // exemplo abaixo o  preco * 0.1 sera verdade!!

        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
    }
}

