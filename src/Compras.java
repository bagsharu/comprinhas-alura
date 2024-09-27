public class Compras {

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
}
