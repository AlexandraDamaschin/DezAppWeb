package com.example.user.lab2app;

public class AutomatMealy extends AutomatMealyAbstract{
    public AutomatMealy(functie fi, functie gi) {
        super(fi, gi);
    }

    @Override
    public String f(String stare, String intrare) {
        return null;
    }

    @Override
    public String g(String stare, String intrare) {
        return null;
    }

    @Override
    public String evolutie(String stareInitiala, String stringIntrare) {
        return f(stareInitiala,stringIntrare);
    }
}
