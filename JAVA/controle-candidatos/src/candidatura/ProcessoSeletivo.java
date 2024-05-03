package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
    
    /*  analisarCandidato(1900);
        analisarCandidato(2000);
        analisarCandidato(2100);
        selecaoCandidatos();
        imprimirSelecionados(); */

        String[] candidatos = {"BETO","CAROL","JONES","ISA","DELL"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativasRealizadas++;
            } else {
                System.out.println("O candidato: " + candidato + " atendeu ao contato com sucesso!");
            }
        }while(continuarTentando && tentativasRealizadas<=3);

        if (atendeu) {
            System.out.println("O candidato: " + candidato + " atendeu ao contato na tentativa " + tentativasRealizadas);
        }else {
            System.out.println("O candidato: " + candidato + " nao atendeu ao contato!");
        }

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"BETO","CAROL","JONES","ISA","DELL","MINA","ROBERT","HUGO","DOUG","DONA"};
        System.out.println("Imprimir candidatos informando indices do elemento:");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de numero: " + (indice+1) + " e " + candidatos[indice]);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"BETO","CAROL","JONES","ISA","DELL","MINA","ROBERT","HUGO","DOUG","DONA"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O canditato(a): " + candidato + " solicitou o valor de salario de " + salarioPretendido);
            if (salarioPretendido <= salarioBase) {
                System.out.println("O candidato " + candidato +" foi selecionado");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido)
        {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR COM CONTRA-PROPOSTAS");
        }else{
            System.out.println("AGUARDANDO OUTROS CANDIDATOS");
        }
    }
}
