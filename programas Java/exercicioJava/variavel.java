package exercicioJava;

import java.util.Arrays;

public class variavel {
    public static void main(String[] args) {
        
    String[] paises = {"BRASIL", "RUSSIA", "INDIA", "CHINA", "AFRICA DO SUL"};

    System.out.println(paises[4]);
    System.out.println(Arrays.toString (paises));

    int posicao = Arrays.binarySearch(paises, "BRASIL");
    System.out.println("Posiçao : " + posicao);

    Arrays.sort (paises, 0, paises.length);
    System.out.println(Arrays.toString(paises));

    String[][]duasdim = {{"Beto", "M", "MG"}, {"Carol", "F", "MG"}};
    System.out.println("indexação: " + duasdim[0][0]);
    }
}
