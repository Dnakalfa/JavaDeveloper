package tela.exemlos.norma;

public class NormaClasse {

    public static void main(String[] args) {
        
        String primeiroNome = "Beto";
        String segundoNome = "Alves";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {

        return "Resultado: " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
