package com.example.alexandra.placetransitionnets;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tranzitie extends Thread {
    private Declansare declansare;
    int tt;
    private ArrayList mIntrari;
    private ArrayList mIesiri;

    public Tranzitie(int t, Declansare b, ArrayList intrari, ArrayList iesiri) {
        declansare = b;
        tt = t;

        mIntrari = intrari;
        mIesiri = iesiri;
    }

    public void run() {
        System.out.println(" Declansat Tranzitie :\t" + tt);
        for (int j = 0; j < 10; j++) {
            declansare.startTranzitia(tt, mIntrari, mIesiri);

            try {
                sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tranzitie.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
