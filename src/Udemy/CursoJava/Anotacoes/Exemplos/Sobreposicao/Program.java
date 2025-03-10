package Udemy.CursoJava.Anotacoes.Exemplos.Sobreposicao;


public class Program {
    public static void main(String[] args) {

       Conta acc1 = new Conta(1001, "alex", 1000.0);
       acc1.withdraw(200.0);
       System.out.println(acc1.getBalance());

       Conta acc2 = new SavingConta(1002, "Maria", 1000.0, 0.01);
       acc2.withdraw(200.0);
       System.out.println(acc2.getBalance());

       Conta acc3 = new SavingConta(1003, "Joao", 1000.0, 500.0);
       acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());


    }
}
