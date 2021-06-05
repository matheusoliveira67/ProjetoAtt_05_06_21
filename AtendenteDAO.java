
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AtendenteDAO {

    /*
    CLASSE QUE MANIPULA OBJETOS (CRUD) DO JAVA E REGISTROS MYSQL DO TIPO 'USUARIO'.
     */

    public boolean existeAtd(Atendente atendente) throws Execption {

        String sql = "SELECT * FROM tb_atendente WHERE nome = ? "
                + "AND senha = ?";

        try {
           // conexao = new ConexaoDB ();
            Connection conn = ConexaoDB.obtemConexao();

            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, atendente.getNome());
            pst.setString(2, atendente.getSenha());

            // executando o comando 'select'
            // e recebendo o retorno
            ResultSet resultado = pst.executeQuery();

            if (resultado.next()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }
    public void inserirAtendente(Atendente atendente) throws Exception {

        String sql = "INSERT INTO tb_atendente (nome, senha) VALUES (? , ?) ";
        try (Connection conexao = ConexaoDB.obtemConexao();
                PreparedStatement pst = conexao.prepareStatement(sql)) {

            pst.setString(1, atendente.getNome());
            pst.setString(2, atendente.getSenha());

            pst.execute();

        }

    }

    public void atualizarAtendente(Atendente atendente) throws Exception {
        // UPTADE tb_curso SET nome = ?, tipo = ?, WHERE id = ?

        String sql = "UPTADE tb_atendente SET nome = ?, senha = ?, WHERE id = ?";
        try (Connection conexao = ConexaoDB.obtemConexao();
                PreparedStatement pst = conexao.prepareStatement(sql)) {

            pst.setString(1, atendente.getNome());
            pst.setString(2, atendente.getSenha());
            pst.setInt(3, atendente.getId());

            pst.execute();

        }

    }

    public void removerAtendente(Atendente atendente) throws Exception {
        String sql = "DELETE FROM tb_atendente WHERE id = ?";
        try (Connection conexao = ConexaoDB.obtemConexao();
                PreparedStatement pst = conexao.prepareStatement(sql)) {

            pst.setInt(1, atendente.getId());

            pst.execute();

        }
    }

    private static class Execption extends Exception {

        public Execption() {
        }
    }

   
}
