package Udemy.CursoJava.Udemy.Exercicios.ProdutoImportado;

import java.text.SimpleDateFormat;
import java.util.Date;

public class produtoUsado extends Produto{

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyyy");
    private Date manufaturaDate;

    public produtoUsado(String name, double preco, Date manufaturaDate) {
        super(name, preco);
        this.manufaturaDate = manufaturaDate;
    }

    public Date getManufaturaDate() {
        return manufaturaDate;
    }

    public void setManufaturaDate(Date manufaturaDate) {
        this.manufaturaDate = manufaturaDate;
    }

    @Override
    public String precotag(){
        return super.getName() + "(Usado) $" + getPreco() + " ManuFatura date: (" + sdf.format(manufaturaDate) + ")";
    }
}
