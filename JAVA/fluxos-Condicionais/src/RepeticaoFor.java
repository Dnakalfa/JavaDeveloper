public class RepeticaoFor {

    public static void main(String[] args) {
        
        /* Exemplo controle repetição For:
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos ++){
            System.out.println("Contando carneirinhos: " + carneirinhos + "\n");
        }
        System.out.println("Eeee Dormiu!!!!");*/

        /* Exemplo controle For Array:
        String alunos[] = {"CAROL", "BETO", "JONES", "MINA", "MARCO", "DOUGLAS"};
        for (int i = 0; i < alunos.length; i++){
            System.out.println("O aluno no indice " + i + " e " + alunos[i]);
        }*/

        /* Exemplo de For Arrays simplificado:
        String alunos[] = {"CAROL", "BETO", "JONES", "MINA", "MARCO", "DOUGLAS"};
        for (String aluno : alunos) {
            System.out.println("O nome do aluno(a) e: " + aluno);
        } */

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
    //                break;
                    continue;
            System.out.println(numero);
        }
    }

}
