package Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.ExemploProdutoConstrutor;

import java.util.Scanner;

public class ProgramaProduto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Produto Data");
        System.out.print("Nome do Produto: ");
        String name = scanner.nextLine();

        System.out.print("Preço do produto: ");
        double preco = scanner.nextDouble();

//      System.out.print("Quantidade do produto: ");
//      int quantidade = scanner.nextInt();

        // Utilizando O encapsulamento:
        Produto product = new Produto(name, preco);
        product.setName("Computador");
        System.out.println("Novo nome: "+ product.getName());

        product.setPreco(1200.00);
        System.out.println("Novo preço: "+ product.getPreco());

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
