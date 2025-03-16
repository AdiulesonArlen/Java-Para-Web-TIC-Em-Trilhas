public class Main {
    public static void main(String[] args) {
       AnimalDeEstimacao cachorro = new Cachorro("Cofap", 8);
       cachorro.mostraNome();
       cachorro.mostraIdade();
       cachorro.comer();
       cachorro.dormir();
       cachorro.emitirSom();

        System.out.println("----------------");
        AnimalDeEstimacao gato = new Gato("Batman", 6);
        gato.mostraNome();
        gato.mostraIdade();
        gato.comer();
        gato.dormir();
        gato.emitirSom();
        System.out.println("-----------");


        FestaDeAniversario niverArthurAdam = new FestaDeAniversario();

        niverArthurAdam.decorar();
        System.out.println("-----------");
        niverArthurAdam.chamarConvidados();
        System.out.println("-----------");
        niverArthurAdam.comprarComida();



    }
}