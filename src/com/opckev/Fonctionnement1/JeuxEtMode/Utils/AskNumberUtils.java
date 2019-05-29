package com.opckev.Fonctionnement1.JeuxEtMode.Utils;

import java.util.Scanner;

public class AskNumberUtils {

    public static int mastermind() {
        Scanner sc = new Scanner(System.in);
        int nbMax = NumberUtils.max();
        int nbMin = NumberUtils.min();
        int proposition = -1;
        boolean taille;
        do {
            System.out.println("Choisissez la taille du chiffre que doit deviner l'ordinateur. Il doit être compris entre " + nbMin + " et " + nbMax);
            proposition = sc.nextInt();
            if (proposition >= nbMin && proposition <= nbMax) {
                taille = true;
            } else {
                System.out.println("Une erreur a été repéré lors de votre saisie");
                taille = false;
            }
        }
        while (taille);
        System.out.println(" ");
        return proposition;
    }
}
