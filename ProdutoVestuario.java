public class ProdutoVestuario extends Produto {

    private String tamanho;
    private String cor;
    private String material;

    // Construtor com os parâmetros do produto vestuário
    public ProdutoVestuario(String nome, double precoCusto, double precoVenda, String tamanho, String cor, String material) {
        super(nome, precoCusto, precoVenda);
        this.tamanho = tamanho;
        this.cor = cor;
        this.material = material;
    }

    // Getters e Setters
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // Método status que retorna as informações do produto vestuário
    @Override
    public String status() {
        return super.status() + ", Tamanho: " + tamanho +
               ", Cor: " + cor + ", Material: " + material;
    }

    // Método para gerar o comando SQL 
    @Override
    public String toInsertSQL() {
        return "INSERT INTO ProdutoVestuario (nome, precoCusto, precoVenda, tamanho, cor, material) VALUES ('" +
               getNome() + "', " + getPrecoCusto() + ", " + getPrecoVenda() + ", '" +
               getTamanho() + "', '" + getCor() + "', '" + getMaterial() + "');";
    }
}
