import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Arhur");
        nomes.add("Adam");
        nomes.add("Anthony");
        nomes.add("Adler");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Meu filho " + nomes.get(i));
        }
    }
}
