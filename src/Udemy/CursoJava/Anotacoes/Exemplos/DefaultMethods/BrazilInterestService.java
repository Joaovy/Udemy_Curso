package Udemy.CursoJava.Anotacoes.Exemplos.DefaultMethods;

import javax.management.InvalidAttributeValueException;
import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService {

    private double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }



}
