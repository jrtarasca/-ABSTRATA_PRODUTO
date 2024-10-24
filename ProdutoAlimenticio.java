import java.util.Date;
import java.text.SimpleDateFormat;

public class ProdutoAlimenticio extends Produto {

    private Date dataValidade;
    private String informacoesNutricionais;

    // Construtor com os parâmetros do produto alimentício
    public ProdutoAlimenticio(String nome, double precoCusto, double precoVenda, Date dataValidade, String informacoesNutricionais) {
        super(nome, precoCusto, precoVenda);
        this.dataValidade = dataValidade;
        this.informacoesNutricionais = informacoesNutricionais;
    }

    // Getters e Setters
    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getInformacoesNutricionais() {
        return informacoesNutricionais;
    }

    public void setInformacoesNutricionais(String informacoesNutricionais) {
        this.informacoesNutricionais = informacoesNutricionais;
    }

    // Método status que retorna as informações do produto alimentício
    @Override
    public String status() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return super.status() + ", Data de Validade: " + sdf.format(dataValidade) +
               ", Informações Nutricionais: " + informacoesNutricionais;
    }

    // Método para gerar o comando SQL
    @Override
    public String toInsertSQL() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "INSERT INTO ProdutoAlimenticio (nome, precoCusto, precoVenda, dataValidade, informacoesNutricionais) VALUES ('" +
               getNome() + "', " + getPrecoCusto() + ", " + getPrecoVenda() + ", '" +
               sdf.format(dataValidade) + "', '" + getInformacoesNutricionais() + "');";
    }
}
