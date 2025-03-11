public class Condicionais_If_Else {
    public static void main(String[] args) {
        boolean estaChovendo = false;
        boolean estaVentando = false;
        boolean estaNublado = false;


        if (estaChovendo && estaVentando) {
            System.out.println("Hoje está chovendo e ventando. Leve um Guarda-chuva forte.");
        } else if (estaChovendo && !estaVentando) {
            System.out.println("Está chovendo, porém não está ventando. Leve um guarda-chuva comum.");
        } else if (estaNublado) {
            System.out.println("Hoje está nublado. Leve um guarda-guva por precaução.");
        } else {
            System.out.println("Hoje está ensolarado. Não precisa levar guarda-chuva.");
        }
    }
}
