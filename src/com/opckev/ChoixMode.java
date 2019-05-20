package com.opckev;

import java.util.Scanner;

class ChoixMode {
    private Scanner sc = new Scanner(System.in);
    boolean continuer;

    int nbresponse;

    void suiteAppli() {
        do {
            System.out.println("Quel mode de jeu souhaitez vous ?");
            System.out.println("1 - Mode challenger");
            System.out.println("2 - Mode défenseur");
            System.out.println("3 - Mode duel");
            System.out.println("4 - Revenir à la selection de jeu");

            nbresponse = sc.nextInt();
            if (nbresponse==1||nbresponse==2||nbresponse==3){
                continuer = true;
            }else if(nbresponse==4){
                Appli lancement = new Appli();
                lancement.PartieUn();
            }
                else {
                continuer = false;
            }
        }
        while (!continuer);
    }

    public void setContinuer(boolean continuer) {
        this.continuer = continuer;
    }

    public void setNbresponse(int nbresponse) {
        this.nbresponse = nbresponse;
    }
}
