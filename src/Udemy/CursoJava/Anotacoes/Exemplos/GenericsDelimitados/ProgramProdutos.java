package Udemy.CursoJava.Anotacoes.Exemplos.GenericsDelimitados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProgramProdutos {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        String path = "/home/joao/Documents/GenericsD.txt";

        try (BufferedReader brLendoArquivo = new BufferedReader(new FileReader(path))){

            String line = brLendoArquivo.readLine();
            while(line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = brLendoArquivo.readLine();

            }
            Product x = CalculationService.max(list);
            System.out.println("O mais caro: ");
            System.out.println(x);



        } catch (IOException e){
            System.out.println("Erro: "+ e.getMessage());
        }

    }

}
