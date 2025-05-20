public class Produto {
    private String nome;
    private double preco;
    private String sku;

    public Produto(String nome, double preco, String sku) {
        if (preco <= 0) {
            throw new IllegalArgumentException("O preço deve ser maior que zero.");
        }
        if (sku == null || sku.trim().isEmpty()) {
            throw new IllegalArgumentException("O SKU não pode ser vazio ou nulo.");
        }
        this.nome = nome;
        this.preco = preco;
        this.sku = sku;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("SKU: " + sku);
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public String getSku() {
        return sku;
    }
}
