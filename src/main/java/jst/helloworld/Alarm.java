package jst.helloworld;

import javax.swing.*;

public class Alarm {


    public Alarm() {
        int count = getGuests();

        JOptionPane.showMessageDialog(null, showCount(count, isTooMuch(count)));
    }

    public int getGuests() {
        return Integer.parseInt(JOptionPane.showInputDialog("Wieviele Gäste sind da?"));
    }

    public boolean isTooMuch(int count) {
        if (count <= 30) {
            return  false;
        }
        else {
            return  true;
        }
    }

    public String showCount(int count, boolean tooMuch) {
        String message;
        message = "Es sind " + count + " Gäste im Raum";
        if (tooMuch) {
            message = message + "\nDie Türen werden geschlossen!";
        }
        else message = message + "\nDie Türen bleiben offen!";

        return message;
    }
}
