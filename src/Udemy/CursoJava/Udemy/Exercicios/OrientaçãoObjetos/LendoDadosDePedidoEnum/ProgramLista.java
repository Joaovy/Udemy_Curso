package Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.LendoDadosDePedidoEnum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class ProgramLista {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Informe os dados do cliente:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Data de Nascimento(DD/MM/YYYY): ");
        Date diaMesAno = sdf.parse(scanner.next());
        Cliente c1 = new Cliente(nome, email, diaMesAno);

        System.out.print("Status: ");
        scanner.nextLine();
        OrderStatus statusOrder = OrderStatus.valueOf(scanner.nextLine().toUpperCase());

        Order order = new Order(statusOrder, new Date(), c1);

        System.out.print("Quantos itens você quer adicionar a esse pedido?: ");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Informe o item #"+ i +": ");
            scanner.nextLine();
            System.out.print("Nome do produto: ");
            String name = scanner.nextLine();

            System.out.print("Preço do produto: ");
            double precoProduto = scanner.nextDouble();

            Produto product = new Produto(name, precoProduto);

            System.out.print("Quantidade: ");
            int quantidadeProduto = scanner.nextInt();

            OrderItem orderItem = new OrderItem(quantidadeProduto, precoProduto, product);

            order.addItem(orderItem);
        }


        System.out.println();
        System.out.println("ORDEM: ");
        System.out.println(order);


        scanner.close();
    }



}
