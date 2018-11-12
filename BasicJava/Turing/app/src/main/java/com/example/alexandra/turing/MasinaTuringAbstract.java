package com.example.alexandra.turing;

public abstract class MasinaTuringAbstract {
    protected ITransitionFunction ff;
    protected StringBuilder bb;

    public MasinaTuringAbstract(ITransitionFunction fi, String banda) {
        ff = fi;
        bb = new StringBuilder(banda);
    }

    public String stareBanda() {
        return bb.toString().trim();
    }

    public abstract Triplet f(String stare, String intrare);

    public abstract String evolutie(String stareInitiala);
}
