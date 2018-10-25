package com.example.alexandra.placetransitionnets;

import java.util.ArrayList;

public class Declansare {
    // gestioneaza starea retelei Petri (M)
    int MM[];

    public Declansare(int M[]) {
        MM = M;
    }

    public synchronized void startTranzitia(int tt, ArrayList intrari, ArrayList iesiri) {
        System.out.println(" Executat Tranzita :\t" + tt);
        for (int i = 0; i < MM.length; i++)
            System.out.print(MM[i] + ",");
        System.out.println("");
    }
}
