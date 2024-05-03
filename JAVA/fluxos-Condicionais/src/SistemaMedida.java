public class SistemaMedida {
    public static void main(String[] args) throws Exception {
        String plano = "T";

        switch (plano) {
            case "B" -> System.out.println("100 minutos de ligação");
            case "M" -> System.out.println("100 minutos de ligação  \nWhatsApp e Instagram Gratis");
            case "T" -> System.out.println("100 minutos de ligação  \nWhatsApp e Instagram Gratis  \n5GB YouTube");
            default  -> System.out.println("Sicla Inválida");
        }
    }
}
