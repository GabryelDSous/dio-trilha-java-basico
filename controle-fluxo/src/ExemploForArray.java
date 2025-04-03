public class ExemploForArray {
    public static void main(String[] args) {
        String[] alunos = {"FELIPE","JONAS", "JULIA", "MARCOS"};

        /*for(int x = 0; x < alunos.length; x++){
            System.out.printf("O aluno no indice x=%d é %s%n", x, alunos[x]);
        }*/

        for(String nome : alunos){
            System.out.printf("Nome do aluno é: %s%n", nome);
        }
    }
}
