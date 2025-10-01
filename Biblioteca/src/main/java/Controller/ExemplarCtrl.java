package Controller;
import Model.Audiobook;
import Model.Exemplar;
import java.time.LocalDate;

public class ExemplarCtrl {
    String id;
    //LivroFisico livro;
    LocalDate dataRetirada;
    //Usuario usuarioEmprestimo;
    LocalDate dataPrevista;
    LocalDate dataDevolucao;
    public ExemplarCtrl(){
        //abrir nova conexao com BD
    }
    
    public void adiciona(Exemplar exemplar){
        //String sql = "insert into Exemplar(id, livro, dataRetirada, usuarioEmprestimo, dataPrevista, dataDevolucao;) VALUES(?, ?, ?, ?, ?, ?)";
        System.out.println("Exemplar adicionado com sucesso!");
    }
}
