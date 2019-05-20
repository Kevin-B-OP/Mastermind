package com.opckev.Fonctionnement1.JeuxEtMode.Mastermind;

import com.opckev.Fonctionnement1.Appli;
import com.opckev.Fonctionnement1.ConsoleUtils;

import java.util.Random;
import java.util.Scanner;

public class MastermindChallenger {
    private static final char OK = 'o';
    private static final char FAUX = 'x';
    Scanner sc = new Scanner (System.in);
    int scoreJoueur = 0;

    public void mode4 (){

        final int NB_CHIFFRES = 4;
        final int MAX = 9;
        final int ESSAIS_MAX = 10;

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
                boolean presentChiffre = chiffres== solution;
                if (bonChiffre) {
                    vrai++;
                }
                else if (presentChiffre) {
                    present++;
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
        System.out.println("Que souhaitez vous faire maintenant ?");
        System.out.println("1 - Rejouer une partie");
        System.out.println("2 - Revenir au menu de sélection");
        System.out.print("3 - Quitter l'application");
        int nbfin4= ConsoleUtils.afficherMenu("",3);
        System.out.println(" ");
        if (nbfin4==1){
            mode4();
        }
        else if (nbfin4==2){
            Appli Menu = new Appli();
            Menu.partieUn();
        }
        else {
            System.out.println("Au revoir");
        }
    }
}
