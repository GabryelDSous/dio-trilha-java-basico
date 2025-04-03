import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // Craindo objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        // Imprimindo os dados obtidos pelo usuario
        System.out.printf("Olá, Me chamo %s %s%n", nome, sobrenome);
        System.out.printf("Tenho %d idade%n", idade);
        System.out.printf("Minha altura é %.2fcm%n", altura);

    }
}
