import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {

    private double valorLimite;
    private double saldoCartao;
    private List<Compras> carrinho;

    public CartaoCredito(double limite) {

        // O objeto de CartaoCredito será instânciado após a inserção do valor pelo usuário
        // Em sua instânciação, receberá como parâmetros o limite que também é atribuído ao
        // saldo do cartão, realiza também a instanciação do carrinho de compras.
        this.valorLimite = limite;
        this.saldoCartao = limite;
        this.carrinho = new ArrayList<>();

    }

    public double getValorLimite() {
        return valorLimite;
    }

    public double getSaldoCartao() {
        return saldoCartao;
    }

    public List<Compras> getCarrinho() {
        return carrinho;
    }

    public boolean adicionarCarrinho (Compras compra) {

        if (this.saldoCartao < compra.getValorDoProduto()) {
            return false;
        }
        this.saldoCartao -= compra.getValorDoProduto();
        this.carrinho.add(compra);
        return true;
    }

    public String toString() {
        return "Saldo Atual: " + this.saldoCartao;
    }

}
