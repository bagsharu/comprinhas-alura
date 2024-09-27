public class Compras implements Comparable<Compras>{

    private String descricaoProd;
    private double valorDoProduto;

    public Compras(String descricaoProd, double valorDoProduto) {
        this.descricaoProd = descricaoProd;
        this.valorDoProduto = valorDoProduto;
    }

    public String getDescricaoProd() {
        return descricaoProd;
    }

    public double getValorDoProduto() {
        return valorDoProduto;
    }

    public String toString() {
        return "Produto: " + this.descricaoProd + " de valor: R$ " + this.valorDoProduto;
    }

    @Override
    public int compareTo(Compras outraCompra) {
        return Double.valueOf(this.valorDoProduto).compareTo(Double.valueOf(outraCompra.valorDoProduto));

    }
}
