/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
