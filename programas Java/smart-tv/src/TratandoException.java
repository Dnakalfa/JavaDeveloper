
import java.text.NumberFormat;
import java.text.ParseException;

public class TratandoException {

    public static void main(String[] args) {
        Number valor;
        
        try {
            valor = NumberFormat.getInstance().parse("a1.76");
            System.out.println(valor);
        } catch (ParseException ex) {
            System.out.println("Deu erro Porra!!");
        }

    }

}
