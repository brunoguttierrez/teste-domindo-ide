package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);


        Livro livro = new Livro("Teste", 300);
        System.out.println(livro);
    }
}
class Livro {
    private String nome;
    private Integer numPags;

    public Livro(String nome, Integer numPags) {
        this.nome = nome;
        this.numPags = numPags;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPags() {
        return numPags;
    }

    public void setNumPags(Integer numPags) {
        this.numPags = numPags;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPags=" + numPags +
                '}';
    }
}
