package com.opckev;

import java.util.Scanner;

public class Appli {

    private Scanner sc = new Scanner(System.in);

    public void PartieUn() {

        //Menu of the application with 3 options
        //nbresponse = answer given by the player
        System.out.println("Bienvenue sur 'Chiffres et déchiffre'");
        System.out.println("Que souhaitez vous faire ? (entrez le numéro correspondant à votre réponse)");
        System.out.println("1 - Jouer au Mastermind");
        System.out.println("2 - Faire une partie de juste prix");
        System.out.println("3 - La pause est finie");

        int nbresponse;

        nbresponse = sc.nextInt();

        if (nbresponse == 1) {
            ChoixMode selectMode = new ChoixMode();
            selectMode.suiteAppli();

        }else if (nbresponse == 2) {
            ChoixMode selectMode = new ChoixMode();
            selectMode.suiteAppli();


        }else if (nbresponse == 3) {
            System.out.println("Au revoir et à bientôt");

        }else {
            System.out.println("Veuillez entrer le nombre correspondant à votre souhait !");
            PartieUn();
        }
    }
}