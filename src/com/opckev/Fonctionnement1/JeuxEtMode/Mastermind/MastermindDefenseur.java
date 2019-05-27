package com.opckev.Fonctionnement1.JeuxEtMode.Mastermind;

import com.opckev.Fonctionnement1.Appli;
import com.opckev.Fonctionnement1.JeuxEtMode.Utils.FinUtils;
import com.opckev.Fonctionnement1.JeuxEtMode.Utils.NumberUtils;

import java.util.Random;
import java.util.Scanner;

public class MastermindDefenseur {
    Scanner sc = new Scanner (System.in);
    int scoreOrdi = 0;
    public void mode5 () {
        final int NB_CHIFFRES = NumberUtils.min();
        final int MAX = 9;
        final int ESSAIS_MAX = NumberUtils.essai();

        final int[] solution = new int[NB_CHIFFRES];

        System.out.println("Quel chiffre proposez vous en challenge à l'ordinateur ?");
        int nombreSaisi = sc.nextInt();

        for (int i = 0; i < NB_CHIFFRES; i++)
            solution[i] = (int) (nombreSaisi / (Math.pow(10, (NB_CHIFFRES - i - 1)))) % 10;

        int count = 0;

        System.out.println("Mastermind mode défenseur : l'ordinateur va essayer de trouver votre combinaison de chiffres" + MAX + ".");
        System.out.println("Il a le droit à " + ESSAIS_MAX + " essais");
        System.out.println("----------------------------");


        int[] chiffres = new int[NB_CHIFFRES];
        boolean victoire;
        do {
            System.out.println("\nEssai n° " + (count + 1) + "/" + ESSAIS_MAX + " :");


            Random r = new Random();
            for (int i = 0; i < NB_CHIFFRES; i++) {
                chiffres[i] = r.nextInt(MAX + 1);
            }

            int vrai = 0;
            int faux = 0;
            victoire = true;
            for (int i = 0; i < NB_CHIFFRES; i++) {
                boolean bonChiffre = chiffres[i] == solution[i];
                if (bonChiffre) {
                    vrai++;
                } else {
                    faux++;
                }

                victoire = victoire && bonChiffre; //
            }
            System.out.println("L'ordinateur a " + vrai + " chiffre(s) présent(s) et " + faux + " mauvais numéro(s)");

            count++;

            if (count == ESSAIS_MAX) {
                System.out.println("Bravo, vous avez réussié à épuiser les " + ESSAIS_MAX + " essais dont l'ordinateur disposait.");
            } else if (count < ESSAIS_MAX && victoire) {
                scoreOrdi++;
                System.out.println("Pas de chance, l'ordinateur a relevé le défi en " + count + " coups");
                System.out.println("Le score de l'ordinateur est de " + scoreOrdi + " point(s)");
            } else {
            }

        }
        while (!victoire && count < ESSAIS_MAX);
        System.out.println(" ");
        fin();
    }
    public void fin() {
        //Menu de fin de jeu
        int nbfin5= FinUtils.finMenu();
        System.out.println(" ");
        if (nbfin5==1){
            System.out.println(" ");
            mode5();
        }
        else if (nbfin5==2){
            System.out.println(" ");
            Appli Menu = new Appli();
            Menu.partieUn();
        }
        else {
            System.out.println("Au revoir");
        }
    }
}
