package Udemy.CursoJava.Anotações.Exemplos.HerancaUpcastingDowncasting;

import Udemy.CursoJava.Anotações.Exemplos.Heranca.BancoEmpresarial;

public class Main {

    public static void main(String[] args) {

        Conta acc = new Conta(1001, "Alex", 0.0);
        BancoEmpresarialEx bacc = new BancoEmpresarialEx(1002, "Maria", 0.0, 500.0);

        // UPCASTING
        Conta acc1 = bacc;
        Conta acc2 = new BancoEmpresarialEx(1003, "bob", 0.0, 200.0);
        Conta acc3 = new SavingConta(1004, "Anna", 0.0, 0.01);


        // DOWNCASTING

        BancoEmpresarialEx acc4 = ((BancoEmpresarialEx)acc2);
        acc4.loan(100.0);

        // Tipo não permitido
        //BancoEmpresarialEx acc5 = ((BancoEmpresarialEx)acc3);

        if(acc3 instanceof BancoEmpresarialEx){
            BancoEmpresarialEx acc5 = (BancoEmpresarialEx) acc3;
            acc5.loan(200.0);
            System.out.println("Loan");
        }



    }

}
