package exercicio04;

/**
 * Define uma classe cidade
 * @author Gabriel Vieira
 *
 */
public class Cidade {
	private String nome;
	private String uf;
	private int populacaoMasculina;
	private int populacaoFeminina;
	private boolean calculado;
	
	public Cidade() {
		
	}
	
	public Cidade(String nome, int populacaoMasculina, 
			int populacaoFeminina) {
		this.nome = nome;
		this.populacaoFeminina = populacaoFeminina;
		this.populacaoMasculina = populacaoMasculina;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getUf() {
		return uf;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public int getPopulacaoMasculina() {
		return populacaoMasculina;
	}
	
	public void setPopulacaoMasculina(int populacaoMasculina) {
		this.populacaoMasculina = populacaoMasculina;
	}


	public boolean isCalculado() {
		return calculado;
	}

	public void setCalculado(boolean calculado) {
		this.calculado = calculado;
	}

	public int getPopulacaoFeminina() {
		return populacaoFeminina;
	}

	public void setPopulacaoFeminina(int populacaoFeminina) {
		this.populacaoFeminina = populacaoFeminina;
	}
	
	
}
