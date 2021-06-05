import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Administrador {
     private int id;
    private String nome;
    private String senha;
   
    public Administrador (){    
    }
    public Administrador (String nome, String senha){
     this.nome=nome;
     this.senha=senha;  
    
    }
    public Administrador(int id) {
        this.id = id;
    }

    
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
     
}
