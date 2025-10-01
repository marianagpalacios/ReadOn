package Controller;
import Model.Audiobook;

public class AudiobookCtrl {
    double duracaoHoras;
    String comentario;
    public AudiobookCtrl(){
        //abrir nova conexao com BD
    }
    
    public void adiciona(Audiobook audiobook){
        //String sql = "insert into Audiobook(duracaoHoras, comentario) VALUES(?, ?)";
        System.out.println("Audiobook adicionado com sucesso!");
    }
}
