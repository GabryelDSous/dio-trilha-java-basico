import java.util.Locale;
import java.util.Scanner;


public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calcularMediaDaTurma(alunos, scanner);

        System.out.printf("Média da turma %.1f", media);
    }

    public static double calcularMediaDaTurma(String[] alunos, Scanner scanner){

        double soma = 0;
        for(String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;
    }
}
