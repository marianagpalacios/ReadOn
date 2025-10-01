package Model;
import java.time.LocalDate;

public class Exemplar {
    String id;
    //LivroFisico livro;
    LocalDate dataRetirada;
    //Usuario usuarioEmprestimo;
    LocalDate dataPrevista;
    LocalDate dataDevolucao;
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    /*
    public LivroFisico getLivro(){
        return livro;
    }
    
    public void setLivro(LivroFisico livro){
        this.livro = livro;
    }
    */
    
    public LocalDate getDataRetirada(){
        return dataRetirada;
    }
    
    public void setDataRetirada(LocalDate dataRetirada){
        this.dataRetirada = dataRetirada;
    }
    
    /*
    public Usuario getUsuarioEmprestimo(){
        return usuarioEmprestimo;
    }
    
    public void setUsuarioEmprestimo(Usuario usuarioEmprestimo){
        this.usuarioEmprestimo = usuarioEmprestimo;
    }
    */
    
    public LocalDate getDataPrevista(){
        return dataPrevista;
    }
    
    public void setDataPrevista(LocalDate dataPrevista){
        this.dataPrevista = dataPrevista;
    }
    
    public LocalDate getDataDevolucao(){
        return dataDevolucao;
    }
    
    public void setDataDevolucao(LocalDate dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    }
    
}
