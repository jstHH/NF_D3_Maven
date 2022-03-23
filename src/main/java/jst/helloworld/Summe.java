package jst.helloworld;

import javax.swing.*;

public class Summe {
    public Summe() {
        int zahl1, zahl2, summe;

        zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Zahl 1 eingeben:"));
        zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Zahl 2 eingeben:"));

        summe = summeBilden(zahl1,zahl2);
        System.out.println("Die Summe von " + Integer.toString(zahl1) + " und " + Integer.toString(zahl2) + " ist: " + SummeString(summe));

        if (zahlenPruefen(zahl1,zahl2) == true)
            System.out.println("Eine der Zahlen war größer als 100!");


    }

    static int summeBilden(int zahl1, int zahl2) {
        int summe;
        summe = zahl1 + zahl2;
        return summe;
    }

    static String SummeString(int summe) {
        return Integer.toString(summe);
    }

    static boolean zahlenPruefen(int zahl1, int zahl2) {
        if (zahl1 > 100 || zahl2 > 100)
            return true;
        else
            return false;
    }

}
