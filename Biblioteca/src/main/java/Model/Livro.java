package Model;


public class Livro {
    private String titulo;
    private String id;
    private String autor;
    //private Avaliacao avaliacoes;
    private String filaReservas;
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(){
        this.titulo = titulo;
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(){
        this.id = id;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(){
        this.autor = autor;
    }
    
    /*
    public String getAvaliacoes(){
        return avaliacoes;
    }
    
    public void setAvaliacoes(){
        this.avaliacoes = avaliacoes;
    }
    */
    
    public String getFilaReservas(){
        return filaReservas;
    }
    
    public void setFilaReservas(){
        this.filaReservas = filaReservas;
    }
}
