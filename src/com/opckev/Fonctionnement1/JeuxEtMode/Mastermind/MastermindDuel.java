package com.opckev.Fonctionnement1.JeuxEtMode.Mastermind;

import com.opckev.Fonctionnement1.Appli;
import com.opckev.Fonctionnement1.JeuxEtMode.Utils.ConsoleUtils;

public class MastermindDuel {
    public void mode6 (){
        System.out.println("Bienvenue sur le mode duel");
        System.out.println("Votre but est d'atteindre le score de 3 avant l'ordinateur. Aucune égalité étant souhaité, vous pourrez être amené à devoir marquer plus de 3 points !");
        System.out.println("A vos marques, prêt, partez !!!");

        System.out.println("Que souhaitez vous faire maintenant ?");
        System.out.println("1 - Rejouer une partie");
        System.out.println("2 - Revenir au menu de sélection");
        System.out.print("3 - Quitter l'application");
        int nbfin6= ConsoleUtils.afficherMenu("",3);
        if (nbfin6==1){
            mode6();
        }
        else if (nbfin6==2){
            Appli Menu = new Appli();
            Menu.partieUn();
        }
        else {
            System.out.println("Au revoir");
        }
    }
}

