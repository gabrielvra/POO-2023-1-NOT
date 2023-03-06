package exercicio02;

/**
 * Classe de teste de {@link Pessoa}
 * @author Gabriel Vieira
 *
 */
public class App {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Gabriel", 'M', "2023-10-10");
		System.out.println("O nome da pessoa é: " + p.getNome());
	}
}
