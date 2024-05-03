public class Usuario {

    public static void main(String[] args) throws Exception{
    
        SmartTV smarTV = new SmartTV();

        System.out.println("A tv esta ligada? " + smarTV.ligada);
        System.out.println("Qual canal? " + smarTV.canal);
        System.out.println("Qual volume? " + smarTV.volume);

        smarTV.ligar();
        System.out.println("A tv esta ligada? " + smarTV.ligada);

        smarTV.desligar();
        System.out.println("A tv esta ligada? " + smarTV.ligada);

        smarTV.diminuirVolume();
        System.out.println("Qual volume? " + smarTV.volume);

        smarTV.mudarCanal(20);
        System.out.println("Qual canal? " + smarTV.canal);
    }

}
