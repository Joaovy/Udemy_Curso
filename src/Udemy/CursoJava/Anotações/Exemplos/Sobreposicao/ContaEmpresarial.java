package Udemy.CursoJava.Anotações.Exemplos.Sobreposicao;

public class ContaEmpresarial extends Conta {

    private double loanLimit;

    public ContaEmpresarial(){
        super();
    }

    public ContaEmpresarial(int number, String holder, double balance, double loanLimit) {
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
            balance += quantia - 10.0;
        }
    }

    @Override
    public void withdraw(double quantia){
    super.withdraw(quantia);
    balance -= 2.0;

    }

}
