
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PessoasVacinadasDAO {

    public List<PessoasVacinadas> buscaPessoas(PessoasVacinadas pessoas) throws Exception {
        String sql = "SELECT nome, idade, profissao, endereco, datavacinacao  FROM tb_fila_de_vacinacao ";

        List<PessoasVacinadas> pessoasVacinadas = new ArrayList<>();
        try (Connection conexao = ConexaoDB.obtemConexao(); PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setInt(1, pessoas.getIdade());
            ps.setBoolean(2, pessoas.getProfissao());
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int ra = rs.getInt("idade");
                    String nome = rs.getString("profissao");
                    pessoasVacinadas.add(new PessoasVacinadas());
                }
            }
        }
        return pessoasVacinadas;
    }
   
    
     public void inserirPessoasVacinadas(PessoasVacinadas pessoas) throws Exception {

        String sql = "INSERT INTO tb_fila_de_vacinacao (nome,idade,profissao,endereco,datavacinacao) VALUES (? , ?, ?,?,?) ";
        try (Connection conexao = ConexaoDB.obtemConexao();
                PreparedStatement pst = conexao.prepareStatement(sql)) {

            pst.setString(1, pessoas.getNome());
            pst.setInt(2, pessoas.getIdade());
             pst.setBoolean(3, pessoas.getProfissao());
             pst.setString(4, pessoas.getEndereco());
             pst.setString(5,pessoas.getData());

            pst.execute();
            
        }
        
        

    }
}
