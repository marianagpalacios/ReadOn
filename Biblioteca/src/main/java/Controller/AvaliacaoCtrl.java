package Controller;
import Model.Livro;

public class AvaliacaoCtrl {
    int nota;
    String comentario;
    
    public AvaliacaoCtrl(){
        //abrir nova conexao com BD
    }
    
    public void adiciona(Livro livro){
        //String sql = "insert into Avaliacao(nota, comentario) VALUES(?, ?)";
        System.out.println("Avaliação adicionada com sucesso!");
    }
}
