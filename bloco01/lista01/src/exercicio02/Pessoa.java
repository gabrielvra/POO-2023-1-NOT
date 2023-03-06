package exercicio02;

/**
 * Essa classe armazena dados de pessoa
 * 
 * @author Gabriel Vieira
 *
 */
public class Pessoa {

	private String nome;
	private char sexo;
	private String dataNascimento;
	private String estadoCivil;
	
	public Pessoa(String nome, char sexo, String dataNascimento) {
		setNome(nome);
		setSexo(sexo);
		this.dataNascimento = dataNascimento;
		this.estadoCivil = "solteiro";
	}

	public String getNome() {
		return nome;
	}

	/**
	 * Pode-se documentar métodos que são complexos
	 * @param nome - o que faz o parâmetro desse método
	 */
	public void setNome(String nome) {
		if (nome.length() > 2) {
			this.nome = nome;
		}
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		if (sexo == 'M' || sexo == 'F') {
			this.sexo = sexo;
		} else {
			//avisar que deu treta
			System.out.println("Deu treta.");
		}
		
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
}