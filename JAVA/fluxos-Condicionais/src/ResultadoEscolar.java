public class ResultadoEscolar {
    public static void main(String[] args) {
    
        int nota = 4;

        /*Condição IF/ELSE

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota<7) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }*/

        /*Condição ternaria, para duas escolhas.

        String resultado = nota>= 7 ? "Aprovado" : "Reprovado";
        System.out.println("Ternario: " + resultado);*/

        /*Condição ternaria, para mais de duas condições.*/

        String resultado = nota>=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println("Ternario: " + resultado);

    }
}
