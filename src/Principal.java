import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Insira abaixo o valor limite do cartão: ");
        double limite = leitura.nextDouble();
        CartaoCredito cartao = new CartaoCredito(limite); // Instanciação de cartão

        int comando = 1;
        while (comando != 0) {
            System.out.println("Insira o produto que deseja comprar ");
            String produto = leitura.nextLine();

            System.out.println("Agora, digite o valor da compra:");
            double valorCompra = leitura.nextDouble();

            // Instância do produto Compras
            Compras comprinha = new Compras(produto,valorCompra);

            // Validação da compra
            boolean statusCompra = cartao.adicionarCarrinho(comprinha);
            if (statusCompra) {
                System.out.println("Compra Realizada! \n Insira 1 para continuar, 0 para finalizar o processo.");
                comando = leitura.nextInt();
            } else {
                System.out.println("Saldos insuficientes :(");
                comando = 0;
            }
        }

        System.out.println("\n-------------------------------------------------------");
        System.out.println("COMPRAS REALIZADAS:");

        // Ordenação dos produtos:
        Collections.sort(cartao.getCarrinho());

        // For-each que percorre a List de produtos no carrinho
        for (Compras c: cartao.getCarrinho()) {
            System.out.println(c.getDescricaoProd() + " - " + c.getValorDoProduto());
        }
        System.out.println("\n-------------------------------------------------------");

        System.out.println("\nSaldo restante: " + cartao.getSaldoCartao());

    }
}
