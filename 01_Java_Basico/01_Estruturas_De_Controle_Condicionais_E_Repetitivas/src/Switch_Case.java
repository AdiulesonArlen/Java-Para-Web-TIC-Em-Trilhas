import java.time.DayOfWeek;
import java.time.LocalDate;

public class Switch_Case {
    public static void main(String[] args) {
        DayOfWeek diaAtual = LocalDate.now().getDayOfWeek();

        String mensagem;

        switch (diaAtual) {
            case MONDAY -> mensagem = "Olá, segunda-feira!" ;
            case TUESDAY -> mensagem = "Olá, terça-feira!" ;
            case WEDNESDAY -> mensagem = "Olá, quarta-feira!" ;
            case THURSDAY -> mensagem = "Olá, quinta-feira!" ;
            case FRIDAY -> mensagem = "Olá, sexta-feira!" ;
            case SATURDAY -> mensagem = "Olá, sábado!" ;
            case SUNDAY -> mensagem = "Olá, domingo!" ;
            default -> mensagem = "Algo deu errado!";
        }

        System.out.println(mensagem);
    }
}
