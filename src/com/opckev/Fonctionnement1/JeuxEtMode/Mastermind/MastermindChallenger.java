package com.opckev.Fonctionnement1.JeuxEtMode.Mastermind;

import com.opckev.Fonctionnement1.Appli;
import com.opckev.Fonctionnement1.JeuxEtMode.Utils.FinUtils;
import com.opckev.Fonctionnement1.JeuxEtMode.Utils.NumberUtils;


import java.util.Random;
import java.util.Scanner;

public class MastermindChallenger {

    Scanner sc = new Scanner (System.in);
    int scoreJoueur = 0;

    public void mode4 (){

        int nbMax= NumberUtils.max();
        int nbMin = NumberUtils.min();
        int ESSAIS_MAX=NumberUtils.essai();

        final int NB_CHIFFRES = (int) (Math.random() * (nbMax - nbMin)) + nbMin;
        final int MAX = 9;

        final int[] solution = new int[NB_CHIFFRES];

        Random r = new Random();
        for(int i=0 ; i<NB_CHIFFRES ; i++) {
            solution[i] = r.nextInt(MAX+1);
        }

        int count = 0;

        System.out.println("Mastermind, trouvez la combinaison des " + NB_CHIFFRES + " chiffres entre 0 et " + MAX + ".");
        System.out.println("Attention, vous avez droit à " + ESSAIS_MAX + " essais");
        System.out.println("----------------------------");


        int[] chiffres = new int[NB_CHIFFRES];
        boolean victoire;
        do {
            System.out.println("\nEssai n° " + (count+1) + "/" + ESSAIS_MAX + " :");
            int nombreSaisi = sc.nextInt();

            for(int i=0 ; i<NB_CHIFFRES ; i++)
                chiffres[i] = (int) (nombreSaisi / (Math.pow(10, (NB_CHIFFRES-i-1)) ))%10;


            int vrai = 0;
            int present =0;
            victoire = true;
            for(int i=0 ; i<NB_CHIFFRES ; i++) {
                boolean bonChiffre = chiffres[i] == solution[i];

                if (bonChiffre) {
                    vrai++;
                }


                victoire = victoire && bonChiffre; //
            }
            System.out.println("Proposition : "+nombreSaisi+" -> Réponse : "+vrai+" bien placé, " +present+" présent");

            count++;

            if(count == ESSAIS_MAX) {
                System.out.println("He non, vous avez epuisé vos " + ESSAIS_MAX + " essais, c'est perdu pour vous...");
                System.out.println("La bonne combinaison était "+solution);
            }else if (count < ESSAIS_MAX && victoire){
                scoreJoueur++;
                System.out.println("Bravo, vous avez réussi en seulement "+count+ " coups");
                System.out.println("Votre score est de "+scoreJoueur+" point(s)");
            }

        }
        while(!victoire && count < ESSAIS_MAX);
        System.out.println(" ");

        //Menu de fin de jeu

        int nbfin4= FinUtils.finMenu();
        System.out.println(" ");
        if (nbfin4==1){
            mode4();
        }
        else if (nbfin4==2){
            Appli.partieUn();
        }
        else {
            System.out.println("Au revoir");
        }
    }
}
