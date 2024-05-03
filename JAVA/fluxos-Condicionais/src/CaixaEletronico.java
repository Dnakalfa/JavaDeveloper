public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorsolicitado = 6.0;

        if (saldo > valorsolicitado){
            saldo = saldo - valorsolicitado;
            System.out.println("Saldo atualizado: " + saldo);
        }else{
            System.out.println("Saldo insuficiente!");
            System.exit(1);
        }

        System.out.println("Saldo final: " + saldo);
    }
}
