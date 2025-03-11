public class Main {
    public static void main(String[] args) {
        pedirSorvete(Enums.CHOCOLATE);
        
    }

    public static void pedirSorvete(Enums sabor){
        System.out.println("Você escolheu o sabor " + sabor);
    }
}
