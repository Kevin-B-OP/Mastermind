package com.opckev.Fonctionnement1.JeuxEtMode.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class NumberUtils {

    public static int max() {
        int nbMax = -1;
        try (InputStream input = new FileInputStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(input);

            nbMax = Integer.parseInt(prop.getProperty("maxcasesM"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return nbMax;
    }
    public static int min(){
        int nbMin =-1;
        try (InputStream input = new FileInputStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            nbMin = Integer.parseInt(prop.getProperty("mincasesM"));
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return nbMin;
    }
    public static int essai(){
        int essaisMax =-1;
        try (InputStream input = new FileInputStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            essaisMax = Integer.parseInt(prop.getProperty("nbtries"));
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return essaisMax;
    }
}
