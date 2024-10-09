package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //Variáveis:
        boolean inclusoNoPlano = true;
        double notaDoFilme = 4.8;
        int anoDeLancamento = 2011;
        double media = (7.6 + 9.3 + 2.4 + notaDoFilme) / 4;
        String sinopse;

        //Declarações de variaveis
        sinopse = "Ao iniciar em uma competição, relampago McQueen se depara com uma crise entre os corredores";

        System.out.println("Este é o Screen Macth");
        System.out.println();
        System.out.println("Filme: Carros 2");
        System.out.println(sinopse);
        System.out.println("Ano de lançamento: "+anoDeLancamento);
        System.out.println("Nota dos espectadores: " + media);
        System.out.println("É incluso? " + inclusoNoPlano);
    }
}