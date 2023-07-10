import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //
        Scanner scan = new Scanner(System.in);
        //
        System.out.println("Digite o número da conta.");
        int Numero = scan.nextInt();
        //
        System.out.println("Digite o número da agência.");
        String Agencia = scan.next();
        //
        System.out.println("Informe seu nome.");
        String nomeCliente = scan.next();
        //
        System.out.println("Informe seu saldo.");
        double Saldo = scan.nextDouble();
        //
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");
    }
}
