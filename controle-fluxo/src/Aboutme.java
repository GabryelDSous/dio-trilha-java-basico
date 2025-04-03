import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class Aboutme {
    public static void main(String[] args) {
        try{
            // Criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Digite o seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o seu sobrenome: ");
            String sobrenome = scanner.nextLine();
        
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite sua altura: ");
            double altura = scanner.nextDouble();

        // Imprimindo os dados obtidos pelo usuario
            System.out.printf("Ola, me chamo %s %s%n", nome.toUpperCase(), sobrenome.toUpperCase());
            System.out.printf("Tenho %d anos%n", idade);
            System.out.printf("Minha Altura é %.2fcm%n", altura);
            scanner.close();
        } catch(InputMismatchException e){
            System.out.println("Os campos idades e altura precisam ser númericos");
        }
    }
}
