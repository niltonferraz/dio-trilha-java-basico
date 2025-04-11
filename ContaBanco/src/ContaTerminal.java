import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibir as msg para o nosso usuário
        // Obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o Nome!");
        String nome = scanner.next();

        System.out.println("Por favor, digite o Saldo!");
        Double saldo = scanner.nextDouble();

        // Exibir a msg conta bancaria
        System.out.println("\"Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência\r\n" + //
                        " é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para\r\n" + //
                        " saque\".");
     
        // Numero Inteiro 1021
        // Agencia Texto 067-8
        // Nome Cliente Texto MARIO ANDRADE
        // Saldo Decimal 237.48

    }
}
