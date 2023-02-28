public class ExemploString {   
    //Instância de uma String com o valor "jose" em um atributo da classe
    private String nome = "jose";

    //Construtor da classe
    public ExemploString(){
        //Concatenar usando atributo
        nome = nome + " da silva";
        //Comparar uma variável com uma outra String
        boolean igual = nome.equals("jose da silva");
        System.out.println("É igual? " + igual);
    }
    public static void main(String[] args) {
        //Cria um objeto
        new ExemploString();
    }
}
