public class Produto {

    private String nome;
    private double precoCusto;
    private double precoVenda;

    // Construtor com os parâmetros do produto
    public Produto(String nome, double precoCusto, double precoVenda) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    // Método para calcular o lucro
    public double calcularLucro() {
        return precoVenda - precoCusto;
    }

    // Método status que retorna as informações do produto
    public String status() {
        return "Nome: " + nome + ", Preço de Custo: R$" + precoCusto +
               ", Preço de Venda: R$" + precoVenda + ", Lucro: R$" + calcularLucro();
    }

    // Método para gerar o comando SQL de inserção
    public String toInsertSQL() {
        return "INSERT INTO Produto (nome, precoCusto, precoVenda) VALUES ('" +
               getNome() + "', " + getPrecoCusto() + ", " + getPrecoVenda() + ");";
    }
}
