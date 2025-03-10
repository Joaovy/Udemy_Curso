package Udemy.CursoJava.Anotacoes.Exemplos.ExercicioResolvidoPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.print("Informe a quantidade de funcionarios: ");
        int quantidadeFuncionarios = scanner.nextInt();

        for(int i = 1; i <= quantidadeFuncionarios; i++){

            System.out.println("Informe os dados do funcionario: #"+ i );
            System.out.print("Funcionario tercerizado? (y/n): ");
            char verificaFuncionario = scanner.next().charAt(0);
            System.out.print("Nome: ");
            scanner.nextLine();
            String nomeFuncionario = scanner.nextLine();
            System.out.print("Horas: ");
            int horasFuncionario = scanner.nextInt();
            System.out.print("Valor por hora: ");
            double valorHora = scanner.nextDouble();

            if(verificaFuncionario == 'y'){
                System.out.print("Taxa Adicional: ");
                double taxaAdicional = scanner.nextDouble();
                Funcionario fun1 = new FuncionarioTercerizado(nomeFuncionario, horasFuncionario, valorHora, taxaAdicional);
                list.add(fun1);
            } else {
                Funcionario fun1 = new Funcionario(nomeFuncionario, horasFuncionario, valorHora);
                list.add(fun1);
            }

        }
        System.out.println();
        System.out.println("PAGAMENTO");
        for (Funcionario fun1 : list){
            System.out.println(fun1.getName() + " $" + String.format("%.2f", fun1.payment()));
        }




        scanner.close();
    }
}
