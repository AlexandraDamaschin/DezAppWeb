package com.example.alexandra.mealy;

public class AutomatMealy extends AutomatMealyAbstract {
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

        for (int i = 0; i < stringIntrare.length(); i++) {
            String currentChar = Character.toString(stringIntrare.charAt(i));

            result += "(";
            result += stare;
            result += ", ";
            result += currentChar;
            result += ", ";

            stare = f(stare, currentChar);

            result += stare;
            result += ", ";
            result += g(stare, currentChar);
            result += ") ";

            if (stare == "err") {
                break;
            }
        }
        return result;
    }
}


