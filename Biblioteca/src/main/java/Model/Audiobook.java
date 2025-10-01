package Model;

public class Audiobook {
    double duracaoHoras;
    String comentario;
    
    public double getDuracaoHoras(){
        return duracaoHoras;
    }
    
    public void setDuracaoHoras(double duracaoHoras){
        this.duracaoHoras = duracaoHoras;
    }
    
    public String getComentario(){
        return comentario;
    }
    
    public void setComentario(String comentario){
        this.comentario = comentario;
    }
}
