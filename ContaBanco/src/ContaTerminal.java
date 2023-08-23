import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\nSeja bem-vindo(a) ao sistema de criação de contas do nosso banco!\n");
        
        System.out.println("\nDigite seu nome completo:\n");
        String nome = scanner.nextLine();  
        
        System.out.println("\nDigite o número da agência:\n");
        String agencia = scanner.nextLine(); 

        System.out.println("\nDigite o número da conta:\n");
        int conta = scanner.nextInt(); 

        System.out.println("\nDigite seu saldo: \n");
        double saldo = scanner.nextDouble();
              
        System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " +  conta + " e seu saldo " +  saldo + " já está disponível para saque.");

        return;
                
    }
}