
import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        // tentando converter uma string parta uma string para um número
        //Number valor = Double.valueOf("a1.75");
        Number valor;
        try {

            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
            
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
