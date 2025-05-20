public class Livro extends Produto {
    private String autor;
    private int numeroPaginas;

    public Livro(String nome, double preco, String sku, String autor, int numeroPaginas) {
        super(nome, preco, sku);
        if (numeroPaginas <= 10) {
            throw new IllegalArgumentException("O número de páginas deve ser maior que 10.");
        }
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void exibirInformacoesCompletas() {
        super.exibirInformacoes();
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroPaginas);
    }

    public String getAutor() { 
    return autor;
    }
    public int getNumeroPaginas() {
    return numeroPaginas;
    }
}
