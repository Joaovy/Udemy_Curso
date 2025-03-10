package Udemy.CursoJava.Udemy.Exercicios.ProdutoImportado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Produto> listProdutos = new ArrayList<>();

        System.out.print("Informe a quantidade de produtos: ");
        int quantidadeProdutos = scanner.nextInt();

        for(int i = 1; i <= quantidadeProdutos; i++){
            System.out.println("Produto #"+ i);
            System.out.print("Produto: Comum, usado, Importado (c/u/i): ");
            char verificaOrigenProduto = scanner.next().charAt(0);
            System.out.print("Nome: ");
            scanner.nextLine();
            String nomeProduto = scanner.nextLine();
            System.out.print("Preço: ");
            double precoProduto = scanner.nextDouble();

            if(verificaOrigenProduto == 'c'){
                Produto pro1 = new Produto(nomeProduto, precoProduto);
                listProdutos.add(pro1);

            } else if (verificaOrigenProduto == 'u') {
                System.out.print("Manufatura date: ");
                Date manufaturaDate = sdf.parse(scanner.next());
                Produto pro1 = new produtoUsado(nomeProduto, precoProduto, manufaturaDate);
                listProdutos.add(pro1);

            } else {
                System.out.print("Taxa Alfandega: ");
                double taxaAlfandega = scanner.nextDouble();
                Produto pro1 = new produtoImportado(nomeProduto, precoProduto, taxaAlfandega);
                listProdutos.add(pro1);

            }


        }

        System.out.println();
        System.out.println("TAGS PRODUTOS");
        for (Produto pro1 : listProdutos){
            System.out.println(pro1.precotag());
        }


        scanner.close();
    }
}
