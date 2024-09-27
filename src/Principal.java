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
        }

    }
}
