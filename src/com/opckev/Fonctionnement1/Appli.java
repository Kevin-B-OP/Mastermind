package com.opckev.Fonctionnement1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

public class Appli {

    public void PartieUn(){
        System.out.println("Bonjour et bienvenue sur cette plateforme de jeux");
        System.out.println("Que souhaitez vous faire ?");
        System.out.println("1 - Jouer au + ou -");
        System.out.println("2 - Jouer au Mastermind");
        System.out.println("3 - Sortir de l'application");
        int nbresponse=ConsoleUtils.afficherMenu("",3);
        if (nbresponse==1){
            System.out.println("A quel mode de jeu voulez vous jouer ?");
            System.out.println("1 - Mode challenger");
            System.out.println("2 - Mode défenseur");
            System.out.println("3 - Mode duel");
            System.out.println("4 - Revenir au menu");
            int nbmenu=ConsoleUtils.afficherMenu("",4);

        }
        else if (nbresponse==2){
            System.out.println("A quel mode de jeu voulez vous jouer ?");
            System.out.println("1 - Mode challenger");
            System.out.println("2 - Mode défenseur");
            System.out.println("3 - Mode duel");
            System.out.println("4 - Revenir au menu");
            int nbmenu=ConsoleUtils.afficherMenu("",4);

        }
        else {
            System.out.println("Au revoir et merci pour votre visite");
        }
    }
}