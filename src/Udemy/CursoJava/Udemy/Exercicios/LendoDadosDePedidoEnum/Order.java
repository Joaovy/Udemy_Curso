package Udemy.CursoJava.Udemy.Exercicios.LendoDadosDePedidoEnum;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyyy");

    private Date moment;
    private OrderStatus status;
    private Cliente client;


    private List<OrderItem> itens = new ArrayList<>();

    public Order(OrderStatus status, Date moment, Cliente client) {
        this.status = status;
        this.moment = moment;
        this.client = client;
    }

    public List<OrderItem> getOdermItens() {
        return itens;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public void addItem(OrderItem orderitem){
        itens.add(orderitem);
    }

    public void removeOrderItem(OrderItem orderitem){
        itens.remove(orderitem);
    }

    public double total(){
        double soma = 0.0;

        for(OrderItem itens : itens){
            soma += itens.subtotal();
        }

        return soma;
    }

    public String toString(){

        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items:\n");
        for (OrderItem item : itens) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();

    }

}
