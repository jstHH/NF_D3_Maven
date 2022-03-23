package jst.helloworld;

import javax.swing.*;

public class Alarm2 {


    public static void main(String[] args) {
        int count = getGuests();
        int alarm = setAlarm();
        System.out.println(showCount(count, alarm, isTooMuch(count, alarm)));
    }

    static public int getGuests() {
        return 10;/*Integer.parseInt(JOptionPane.showInputDialog("Wieviele Gäste sind da?"));*/
    }

    static public boolean isTooMuch(int count, int alarm) {
        boolean tooMuch = true;
        if (alarm == 1 && count <= 60) {
            tooMuch =  false;
        }
        else if (alarm == 2 && count <=30) {
            tooMuch =  false;
        }

        return tooMuch;

    }

    public static int setAlarm() {
        //1=grün, 2=gelb, 3=rot
        return 3;
    }

    static public String showCount(int count, int alarm, boolean tooMuch) {
        String message;
        message = "Es sind " + count + " Gäste im Raum und es gilt Alarmstufe " + alarm;
        if (tooMuch) {
            message = message + "\nDie Türen werden geschlossen!";
        }
        else message = message + "\nDie Türen bleiben offen!";

        return message;
    }
}
