package Udemy.CursoJava.Anotações.Exemplos.Heranca;

public class BancoEmpresarial extends Conta{

    private double loanLimit;

    public BancoEmpresarial(){
        super();
    }

    public BancoEmpresarial(int number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        // construtor da super classe conta!

        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double quantia){
        if(quantia <= loanLimit) {
            balance += quantia - 10;
        }
    }
}
