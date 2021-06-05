
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class FilaVacinacaoTableModel  extends AbstractTableModel  {

     private List<PessoasVacinadas> pessoas;
    private String[] colunas = {"nome", "idade","profissao", "endereco", "datavacinacao"};

    public FilaVacinacaoTableModel(PessoasVacinadas pessoasVacinadas) throws Exception {
        PessoasVacinadasDAO dao = new PessoasVacinadasDAO();
        this.pessoas = dao.buscaPessoas((PessoasVacinadas) pessoas);
    }

    @Override
    public int getRowCount() {
        return pessoas.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return this.pessoas.get(rowIndex).getNome();
            case 1:
                return this.pessoas.get(rowIndex).getIdade();
            case 2:
                return this.pessoas.get(rowIndex).getProfissao();
                
            case 3:
                return this.pessoas.get(rowIndex).getEndereco();
                
            case 4:
                return this.pessoas.get(rowIndex).getData();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }
}
