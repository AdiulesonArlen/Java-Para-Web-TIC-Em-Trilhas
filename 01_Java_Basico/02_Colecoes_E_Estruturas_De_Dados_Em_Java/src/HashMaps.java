import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> listaDeCompras = new HashMap<>();

        listaDeCompras.put("Laranja", 5);
        listaDeCompras.put("Cupuaçú", 2);
        listaDeCompras.put("Abacate", 3);
        listaDeCompras.put("Cacau", 5);

        System.out.println(listaDeCompras);
    }
}
