import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO:Conhecer e importar a classe Scanner
        Scanner scan = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário
        // Obter pela classe Scanner os valores digitados no terminal

        System.out.println("Por favor, digite o número da Conta !");
        int numeroConta = scan.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String numeroAgencia = scan.next();

        System.out.println("Por favor, digite o seu nome !");
        scan.nextLine();
        String nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o seu saldo !");
        double saldoCliente = scan.nextDouble();

        // Exibir a mensagem conta criada
        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque",
                nomeCliente, numeroAgencia, numeroConta, saldoCliente);
    }
}
