package Udemy.CursoJava.Anotações.Exemplos.HerancaUpcastingDowncasting;

public class BancoEmpresarialEx extends Conta{

    private double loanLimit;

    public BancoEmpresarialEx(){
        super();
    }

    public BancoEmpresarialEx(int number, String holder, double balance, double loanLimit) {
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
