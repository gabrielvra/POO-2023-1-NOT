public class Aluno {
    //ATRIBUTOS
    private String nome;
    private double nota1;
    private double nota2;

    //MÉTODOS
    @Override
    public String toString() {
        return String.format("A média do aluno %s é %.2f",getNome(),(getNota1()+getNota2())/2);
    }

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
}
