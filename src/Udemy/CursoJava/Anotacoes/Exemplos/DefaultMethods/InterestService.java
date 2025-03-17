package Udemy.CursoJava.Anotacoes.Exemplos.DefaultMethods;

import java.security.InvalidParameterException;

public interface InterestService {

    double getInterestRate();
    default double payment(double amount, int months){
        if (months < 1 ){
            throw  new InvalidParameterException("Meses devem ser maior que zero!");

        }
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
    }
}
