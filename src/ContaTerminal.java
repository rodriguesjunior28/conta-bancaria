import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //Conhecer e importar a classe scanner 

       //Exibir as mensagens para nosso usuário

       //Obter pela scanner os valores digitados no terminal

       //Exibir a mensagem conta criada

       @SuppressWarnings("resource")
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Digite seu nome: ");
       String nome = scanner.nextLine();

       System.out.println("Digite seu sobrenome: ");
       String sobrenome = scanner.nextLine();

       System.out.println("Digite sua data, mês e ano de nascimento: ");
       String nascimento = scanner.next();

       System.out.println("Digite seu cpf: ");
       int cpf = scanner.nextInt();

       System.out.println("Digite seu cep: ");
       long cep = scanner.nextLong();

       System.out.println("Digite seu endereço: ");
       String endereco = scanner.next();

       System.out.println("Seja bem vindo(a) " + nome + " " + sobrenome + ", Conta criada com sucesso!");
    }
}
