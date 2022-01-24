package br.com.dio;

import java.util.Objects;

public class Gato {
    private String nome;
    private String cor;
    private String idade;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(nome, gato.nome) && Objects.equals(cor, gato.cor) && Objects.equals(idade, gato.idade);
    }

    @Override
    public String toString() {
        return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cor == null) ? 0 : cor.hashCode());
        result = prime * result + ((idade == null) ? 0 : idade.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }




	/*public Gato(String nome, String cor, String idade) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}*/


    public Gato() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

}
