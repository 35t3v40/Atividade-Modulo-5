import java.util.Scanner;

public class atividadeModulo5 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, seja bem vindo(a) ao nosso sistema de cadastro");

        System.out.println("Por favor, digite seu nome completo:");
        String nome = scanner.nextLine();

        System.out.println("Agora digite sua idade:");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Agora digite seu CPF");
        String cpf = scanner.nextLine();

        System.out.println("Agora digite sua altura:");
        double altura = scanner.nextDouble();

        System.out.println("Agora digite seu peso:");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Agora digite seu estado civil:");
        String civil = scanner.nextLine();

        System.out.println("Agora digite se você crê em Jesus Cristo como seu único Senhor e Salvador (true) ou não (false)");
        boolean cre = scanner.nextBoolean();

        scanner.close();

        System.out.println("Confirme seus dados");
        System.out.println("Seu nome é " + nome + ", sua idade é " + idade + " seu CPF é " + cpf + ", sua altura e peso são " + altura + " e " + peso + ", seu estado civil é " + civil + ", e quanto a você crer em Jesus Cristo como seu único Senhor e Salvador: " + cre );
    }
}
