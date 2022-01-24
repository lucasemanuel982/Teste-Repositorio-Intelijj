package br.com.dio;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        System.out.println("Primeiro Programa Intellij");

        Gato gato = new Gato ();
        Livros livros =  new Livros();

        System.out.println(gato);
        System.out.println(livros);  //irá aparecer o nome do pacote, pois não foi implementado o to String
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
    private String tipo;
}
