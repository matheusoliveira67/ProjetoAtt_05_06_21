
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdministradorDAO {
    

    public boolean existeAdm(Administrador administrador) throws Exception {

        String sql = "SELECT * FROM tb_administrador WHERE nome = ? "
                + "AND senha = ?";
        try {
            // conexao = new ConexaoDB ();
            Connection conn = ConexaoDB.obtemConexao();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, administrador.getNome());
            pst.setString(2, administrador.getSenha());
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

    public void inserirAdministrador(Administrador administrador) throws Exception {

        String sql = "INSERT INTO tb_administrador (nome, senha) VALUES (? , ?) ";
        try (Connection conexao = ConexaoDB.obtemConexao();
                PreparedStatement pst = conexao.prepareStatement(sql)) {

            pst.setString(1, administrador.getNome());
            pst.setString(2, administrador.getSenha());

            pst.execute();

        }

    }

    public void atualizarAdministrador(Administrador administrador) throws Exception {
        // UPTADE tb_curso SET nome = ?, tipo = ?, WHERE id = ?

        String sql = "UPTADE tb_administrador SET nome = ?, senha = ?, WHERE id = ?";
        try (Connection conexao = ConexaoDB.obtemConexao();
                PreparedStatement pst = conexao.prepareStatement(sql)) {

            pst.setString(1, administrador.getNome());
            pst.setString(2, administrador.getSenha());
            pst.setInt(3, administrador.getId());

            pst.execute();

        }

    }

    public void removerAdministrador(Administrador administrador) throws Exception {
        String sql = "DELETE FROM tb_administrador WHERE id = ?";
        try (Connection conexao = ConexaoDB.obtemConexao();
                PreparedStatement pst = conexao.prepareStatement(sql)) {

            pst.setInt(1, administrador.getId());

            pst.execute();

        }
    }

   

}
