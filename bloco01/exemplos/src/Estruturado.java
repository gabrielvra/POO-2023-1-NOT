import java.util.Scanner;

public class Estruturado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nomeAluno = "";

        System.out.println("Digite o nome do Aluno: ");
        nomeAluno = scanner.next();
    
        while (!"fim".equals(nomeAluno)){
            System.out.println("Sua primeira nota:");
            Double nota1 = scanner.nextDouble();
            System.out.println("Sua segunda nota:");
            Double nota2 = scanner.nextDouble();
            System.out.println(String.format("A média do aluno %s é %.2f",nomeAluno,(nota1+nota2)/2));

            System.out.println("Digite o nome do Aluno ou 'fim' para encerrar: ");
            nomeAluno = scanner.next();
        }

        scanner.close();
    }
}