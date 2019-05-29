package com.opckev.Fonctionnement1.JeuxEtMode.Utils;

public class ScoreUtils {

    public static int comptage(int NB_CHIFFRES, int chiffres[][], int solution[]) {

        int vrai = 0;
        int i = 0;
        boolean bonChiffre = chiffres[i][1] == solution[i];

        for (i = 0; i < NB_CHIFFRES; i++) {
            if (bonChiffre) {
                chiffres[i][2] = 1;
                vrai++;
            } else {
                chiffres[i][2] = 0;
            }
        }
        return vrai;
    }

    public static int comptage2(int NB_CHIFFRES, int chiffres[][], int solution[]) {
        int present = 0;
        int a = 0;

        int i = 0;
        boolean malPlace = chiffres[i][1] == solution[a];

        for (i = 0; i < NB_CHIFFRES; i++) {
            for (a = 0; a < NB_CHIFFRES; a++) {
                if (malPlace) {
                    chiffres[i][3] = 1;
                } else {
                    chiffres[i][3] = 0;
                }
            }
        }
        for (i = 0; i < NB_CHIFFRES; i++) {
            if (chiffres[i][2] != 1 && chiffres[i][3] == 1) {
                present++;
            }
        }
        return present;
    }
}