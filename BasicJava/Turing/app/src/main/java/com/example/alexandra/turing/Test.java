package com.example.alexandra.turing;

public class Test {
    public static void main(String[] args) {

        TransitionFunction transitionFunction = new TransitionFunction();
        MasinaTuring turing = new MasinaTuring(transitionFunction,"000011");
        System.out.println(turing.evolutie("0"));
    }
}
