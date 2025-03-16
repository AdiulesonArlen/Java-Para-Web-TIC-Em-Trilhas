public class Gato extends AnimalDeEstimacao {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("miau...");
    }


}
