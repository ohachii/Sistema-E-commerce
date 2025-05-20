public class Eletronico extends Produto {
    private String fabricante;
    private int voltagem;

    public Eletronico(String nome, double preco, String sku, String fabricante, int voltagem) {
        super(nome, preco, sku);
        if (voltagem != 110 && voltagem != 220) {
            throw new IllegalArgumentException("A voltagem deve ser 110 ou 220.");
        }
        this.fabricante = fabricante;
        this.voltagem = voltagem;
    }

    public void exibirInformacoesCompletas() {
        super.exibirInformacoes();
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Voltagem: " + voltagem + "V");
    }

    public String getFabricante() {
        return fabricante;
        }
    public int getVoltagem() {
            return voltagem;
    }
}
