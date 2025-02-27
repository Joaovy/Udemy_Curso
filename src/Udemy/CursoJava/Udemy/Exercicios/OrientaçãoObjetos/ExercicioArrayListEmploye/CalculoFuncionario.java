package Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.ExercicioArrayListEmploye;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculoFuncionario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qunatos funcionarios você deseja registrar?: ");
        int n = scanner.nextInt();

        List<Funcionario> listaFuncionario = new ArrayList<>();

        for (int i = 0; i < n; i++){

            System.out.println("Funcionario "+ (i + 1) +":");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Salario: ");
            double salarioFuncionario = scanner.nextDouble();

            Funcionario funcionario = new Funcionario(id, nome, salarioFuncionario);
            listaFuncionario.add(funcionario);

        }

        System.out.println("Informe o ID do funcionario que deseja adicionar o bonus: ");
        int idBusca = scanner.nextInt();

        Funcionario encontrado = null;
        for(Funcionario f : listaFuncionario){
            if (f.getId() == idBusca){
                encontrado = f;
                break;
            }
        }

        if(encontrado != null){

            System.out.println("Informe a porcventagem que deseja adicionar ao funcionario: ");
            double porcentagem = scanner.nextDouble();
            encontrado.adicionarPorcentagem(porcentagem);

            System.out.println("Lista de Funcionarios: ");
            for(Funcionario x : listaFuncionario){
                System.out.println(x);
            }

        } else{
            System.out.println("Nenhum funcionario encontrado com esse id!");
            System.out.println("Lista de Funcionarios: ");
            for(Funcionario x : listaFuncionario){
                System.out.println(x);
            }

        }

        scanner.close();
    }
}
