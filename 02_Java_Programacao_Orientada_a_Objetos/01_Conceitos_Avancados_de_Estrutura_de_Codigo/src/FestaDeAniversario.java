public class FestaDeAniversario implements Tarefas {

    @Override
    public void decorar() {
        System.out.println("Comprar balões");
        System.out.println("Colocar as fitas");
    }

    @Override
    public void chamarConvidados() {
        System.out.println("Chamar a Elisangela");
        System.out.println("Chamar o Shweinsteiger");
    }

    @Override
    public void comprarComida() {
        System.out.println("Comprar mini-coxinhas");
        System.out.println("Comprar docinhos");
        System.out.println("Comprar o bolo de aniversário");
    }
}
