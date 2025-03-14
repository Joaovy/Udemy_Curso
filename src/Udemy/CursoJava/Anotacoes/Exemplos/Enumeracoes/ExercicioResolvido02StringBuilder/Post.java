package Udemy.CursoJava.Anotacoes.Exemplos.Enumeracoes.ExercicioResolvido02StringBuilder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");

    private Date moment;
    private String titulo;
    private String conteudo;
    private int likes;

    private List<Comentario> comentarios = new ArrayList<>();

    public Post(Date moment, String titulo, String conteudo, int likes) {
        this.moment = moment;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

   public void addComentario(Comentario comentario){
        comentarios.add(comentario);

   }

   public void removeComentario(Comentario comentario){
        comentarios.remove(comentario);

   }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(titulo + "\n");
        sb.append(likes);
        sb.append(" likes - ");
        sb.append(sdf.format(moment)+ "\n");
        sb.append(conteudo + "\n");
        sb.append("Comentarios: \n");
        for(Comentario c : comentarios){
            sb.append(c.getTexto()+ "\n");
        }

        return sb.toString();
    }
}
