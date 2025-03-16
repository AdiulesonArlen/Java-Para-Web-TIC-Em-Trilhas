public abstract class AnimalDeEstimacao {
    String nome;
    int idade;

    public AnimalDeEstimacao(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void comer() {
        System.out.println(nome + " está comendo...");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo...");
    }

    public void mostraNome() {
        System.out.println(nome);
    }

    public void mostraIdade() {
        System.out.println(idade);
    }

    public abstract void emitirSom();
}
