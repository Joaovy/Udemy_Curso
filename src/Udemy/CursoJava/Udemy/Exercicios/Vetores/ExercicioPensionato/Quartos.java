package Udemy.CursoJava.Udemy.Exercicios.Vetores.ExercicioPensionato;

public class Quartos {

    private String nomeHospede;
    private String emailHospede;
    private int numeroQuarto;

    public Quartos(String nomeHospede, String emailHospede, int numeroQuarto) {
        this.nomeHospede = nomeHospede;
        this.emailHospede = emailHospede;
        this.numeroQuarto = numeroQuarto;
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public String getEmailHospede() {
        return emailHospede;
    }

    public void setEmailHospede(String emailHospede) {
        this.emailHospede = emailHospede;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public String toString(){
        return nomeHospede +", "+ emailHospede;
    }
}
