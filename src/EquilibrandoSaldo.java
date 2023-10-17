import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        // Calculando o saldo atualizado
        double saldoAtualizado = saldoAtual + valorDeposito - valorRetirada;

        // Imprimindo o saldo atualizado com uma casa decimal
        System.out.printf("Saldo atualizado na conta: %.1f%n", saldoAtualizado);
    }
}
