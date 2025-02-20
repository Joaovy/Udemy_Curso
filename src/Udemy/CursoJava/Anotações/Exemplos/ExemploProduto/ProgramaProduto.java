package Udemy.CursoJava.Anotações.Exemplos.ExemploProduto;

import java.util.Scanner;

public class ProgramaProduto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto product = new Produto();

        System.out.println("Produto Data");
        System.out.print("Nome do Produto: ");
        product.name = scanner.nextLine();

        System.out.print("Preço do produto: ");
        product.preco = scanner.nextDouble();

        System.out.print("Quantidade do produto: ");
        product.quantidade = scanner.nextInt();

        // o metodo toString converte um objeto para uma string!!
        //System.out.println(product.toString());
        // Mas também o java indentifica que o obejto esta em um contexto de println e exibe o nome do produto!!
        System.out.println("Produto data: "+ product);

        System.out.print("Adicione um numero de produtos para ser adicionados no estoque: ");
        int quantidade = scanner.nextInt();
        product.addProdutos(quantidade);

        System.out.println();
        System.out.println("Atualização do produto: "+ product);

        System.out.print("Informe um numero de produtos para ser removido no estoque: ");
        quantidade = scanner.nextInt();
        product.removeProdutos(quantidade);

        System.out.println();
        System.out.println("Atualização do produto: "+ product);

        //System.out.println(product.name +", "+ product.quantidade + ", "+ product.preco);

        scanner.close();
    }
}
