import java.util.Scanner;

public class OrientadoObjetos {
    
    public OrientadoObjetos(){

        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do Aluno: ");
        aluno.setNome(scanner.next());
    
        while (!"fim".equals(aluno.getNome())){
            System.out.println("Sua primeira nota:");
            aluno.setNota1(scanner.nextDouble());
            System.out.println("Sua segunda nota:");
            aluno.setNota2(scanner.nextDouble());

            System.out.println(aluno.toString());

            System.out.println("Digite o nome do Aluno ou 'fim' para encerrar: ");
            aluno = new Aluno();
            aluno.setNome(scanner.next());
        }
        scanner.close();
    }
    public static void main(String[] args) {
        new OrientadoObjetos();
    }
}
