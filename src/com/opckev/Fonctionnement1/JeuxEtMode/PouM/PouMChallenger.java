package com.opckev.Fonctionnement1.JeuxEtMode.PouM;

import com.opckev.Fonctionnement1.Appli;
import com.opckev.Fonctionnement1.JeuxEtMode.Utils.ConsoleUtils;

public class PouMChallenger {
    public void mode1 (){
        System.out.println("Coucou1");
        System.out.println("Que souhaitez vous faire maintenant ?");
        System.out.println("1 - Rejouer une partie");
        System.out.println("2 - Revenir au menu de sélection");
        System.out.print("3 - Quitter l'application");
        int nbfin1= ConsoleUtils.afficherMenu("",3);
        if (nbfin1==1){
            mode1();
        }
        else if (nbfin1==2){
            Appli Menu = new Appli();
            Menu.partieUn();
        }
        else {
            System.out.println("Au revoir");
        }
    }
}
