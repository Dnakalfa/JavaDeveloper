
import java.util.Random;

public class RepeticaoWhile {

    public static void main(String[] args) {
        
    /*
        double mesada = 50.0;
    
        while (mesada > 0) {
            Double valordoce = valorAleatorio();
            if (valordoce > mesada)
                valordoce = mesada;

            System.out.println("doce de valor: " + valordoce + "Adicionado: " + valordoce);
            mesada = mesada - valordoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joao gastou toda a sua mesada!");
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    } */
    
    System.out.println("Discando....");

    do {
        System.out.println("Telefone tocando...");
    } while (tocando());
    System.out.println("Alô...");
}
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("atendeu? " + atendeu);
        return ! atendeu;
    }
}

