public class Main {
    public static void main(String[] args) {
        String priNumTex = "20";
        String segNumTex = "0";

        try {
            int priNum = Integer.parseInt(priNumTex);
            int segNum = Integer.parseInt(segNumTex);

            System.out.println("A divisão é: " + (priNum / segNum));
        } catch (Exception ex) {
            System.out.println("Algo deu errado. A mensagem do sistema foi: " + ex.getMessage());
        }
        System.out.println("Está acontecendo depois do erro.");
    }
}