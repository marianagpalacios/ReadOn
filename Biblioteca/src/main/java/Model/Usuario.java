package model;

/**
 *
 * @author Aluno
 */
public class Usuario {
    private String id;
    private String nome;
    private String email;
    private Boolean bloqueado;
    private int emprestimos_Ativos;
    public String getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public Boolean getBloqueado(){
        return bloqueado;
    }
    public int getEmprestimos_Ativos(){
        return emprestimos_Ativos;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setBloqueado(Boolean bloqueado){
        this.bloqueado = bloqueado;
    }
    public void setEmprestimos_Ativos(int emprestimos_Ativos){
        this.emprestimos_Ativos = emprestimos_Ativos;
    }
}
