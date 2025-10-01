package Controller;
import Model.Ebook;

public class EbookCtrl {
    String formato;
    double tamanhoMb;
    public EbookCtrl(){
        //abrir nova conexão com BD 
    }
    
    public void adiciona(Ebook ebook){
        //String sql = "insert into Ebook(formato, tamanhoMb) VALUES(?, ?)";
        System.out.println("Ebook adicionado com sucesso!");
    }
}
