package exercicio03;

public class App {

	public static void main(String[] args) {
		Produto produto01 = new Produto("Caderno",
				"Caderno em espiral tamanho médio", 4.5f,15);
		
		Produto produto02 = new Produto("Caneta ESF",
				"Caneta esferográfica 5mm", 1.2f, 2);
		
		Produto produto03 = new Produto("Esquadro",
				"“Esquadro de acrílico 20 cm", 2.35f, 10);
		
		
		System.out.println(produto01);
	}
}
