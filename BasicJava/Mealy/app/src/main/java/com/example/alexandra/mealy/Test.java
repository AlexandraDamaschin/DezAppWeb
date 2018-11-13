package com.example.alexandra.mealy;

import android.provider.Settings;

import java.util.Random;

public class Test {
    public static void main(String[] args) {

        String enters[] = {"a", "b", "c"};

        fc fcInst = new fc();
        gc gcInst = new gc();
        AutomatMealy test = new AutomatMealy(fcInst, gcInst);
        String firstState = test.f("1", "a");
        String firstEnter = test.g("1", "a");

        test.evolutie(firstState,firstEnter);

    }
}
