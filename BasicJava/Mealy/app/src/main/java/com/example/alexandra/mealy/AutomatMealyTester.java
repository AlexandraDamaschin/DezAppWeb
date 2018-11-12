package com.example.alexandra.mealy;

public class AutomatMealyTester {

    AutomatMealyAbstract mealy;

    public AutomatMealyTester(AutomatMealyAbstract mealy) {
        this.mealy = mealy;
    }

    void test(String stareInitiala, String stringIntrare) {
        System.out.println(mealy.evolutie(stareInitiala, stringIntrare));
    }
}
