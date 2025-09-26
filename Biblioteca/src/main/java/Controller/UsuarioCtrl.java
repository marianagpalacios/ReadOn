/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import model.Usuario;

/**
 *
 * @author Aluno
 */
public class UsuarioCtrl {
    private String id;
    private String nome;
    private String email;
    private Boolean bloqueado;
    private int emprestimos_Ativos;
    public UsuarioCtrl(){
        //abrir nova conexão
    }
    public void adiciona(Usuario usuario){
        //String sql = "insert into Usuario(id,nome,email,bloqueado,emprestimos_Ativos) VALUES(?,?,?,?,?)";
        System.out.println("Usuário adicionado com sucesso");
    }
}
