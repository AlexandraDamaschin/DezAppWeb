package com.example.user.lab2app;

public abstract class AutomatMealyAbstract {
    functie ff;
    functie gg;
    public AutomatMealyAbstract (functie fi, functie gi){
        ff=fi;
        gg=gi;
    }
    public abstract String f(String stare,String intrare);
    public abstract String g(String stare,String intrare);
    public abstract String evolutie(String stareInitiala,String stringIntrare);

}
