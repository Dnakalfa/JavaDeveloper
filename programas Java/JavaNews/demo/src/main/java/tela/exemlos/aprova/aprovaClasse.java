package tela.exemlos.aprova;

public class aprovaClasse {
    public static void main(String[] args) {
        int mediaFinal = 1;
        if (mediaFinal < 6) {
            System.out.println("Reprovado");
        } else if (mediaFinal == 6) {
            System.out.println("Recuper");
        } else {
            System.out.println("Aprovado");
        }
    }
}
