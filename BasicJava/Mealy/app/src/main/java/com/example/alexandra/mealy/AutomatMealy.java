package com.example.alexandra.mealy;

import java.util.Random;

public class AutomatMealy extends AutomatMealyAbstract {

    String enters[] = {"a", "b", "c"};


    public AutomatMealy(functie fi, functie gi) {
        super(fi, gi);
    }

    @Override
    public String f(String stare, String intrare) {
        return ff.calcul(stare, intrare);
    }

    @Override
    public String g(String stare, String intrare) {
        return gg.calcul(stare, intrare);
    }

    @Override
    public String evolutie(String stareInitiala, String stringIntrare) {
        String result = new String();

        String stare = stareInitiala;
        while (stare != "5"){

            int idx = new Random().nextInt(enters.length);
            String randomEnter = (enters[idx]);

            result = new String();
            result += "(";
            result += stare;
            result += ", ";
            result += randomEnter;
            result += ", ";

            stare = f(stare, randomEnter);

            result += stare;
            result += ", ";
            result += g(stare, randomEnter);
            result += ") ";
            System.out.println(result);
//            String state = test.f(firstState, randomEnter);
//            String enter = test.g(firstState,randomEnter);
           // System.out.println(test.evolutie(stare,randomEnter));
            // System.out.println("(" + state + "," + "," + enter + ")");
//            firstEnter = enter;
//            firstState = state;

        }
        return result;
    }
}


