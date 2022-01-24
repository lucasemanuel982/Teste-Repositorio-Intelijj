package br.com.dio;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        System.out.println("Primeiro Programa Intellij");

        Gato gato = new Gato ();
       // Livros livros =  new Livros(); //iniciando um novo livro

        Livros livro1 = new Livros("Sherlock 1",  300);

        System.out.println(gato);
        System.out.println(livro1);  //irá aparecer o nome do pacote, pois não foi implementado o to String
        System.out.println("Teste Git.");
        System.out.println("Outro Test!");


    }

		/*String primeiro =JOptionPane.showInputDialog("Informe o primeiro número: ");
		int a = Integer.parseInt(primeiro);

		String segundo = JOptionPane.showInputDialog("Informe o segundo número: ");

		int b = Integer.parseInt(segundo);


		System.out.println("Hello Word!" + (a+b));
		JOptionPane.showMessageDialog(null, "Hello Word! " + (a+b));
	}*/





}
class Livros {
    private String nome;
    private  Integer numPaginas;

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Livros(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }
}
