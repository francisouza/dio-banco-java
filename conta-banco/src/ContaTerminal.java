import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nome;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência. ");
        agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua conta. ");
        numero  = scanner.nextInt();

        System.out.println("Agora digite o seu nome completo. ");
        nome = scanner.next();

        System.out.println("O saldo da sua conta é: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e o seu saldo " + saldo + " já está disponível para saque.");
    }
}
