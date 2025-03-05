package Udemy.CursoJava.Anotações.Exemplos.Enumeracoes;

import java.util.Date;

public class CicloDePedido {

    public static void main(String[] args) {

        Pedido order = new Pedido(1080, new Date(), OrdemStatus.AGUARDANDO_PAGAMENTO);
        System.out.println(order);
        // Exibimdo algo do enum


        // Conversão de String para enum!
        OrdemStatus os1 = OrdemStatus.ENTREGUE;
        OrdemStatus os2 = OrdemStatus.valueOf("ENTREGUE");

        System.out.println(os1);
        System.out.println(os2);



    }

}
