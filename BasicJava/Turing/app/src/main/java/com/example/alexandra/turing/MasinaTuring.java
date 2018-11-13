package com.example.alexandra.turing;

public class MasinaTuring extends MasinaTuringAbstract {

    public MasinaTuring(ITransitionFunction fi, String banda) {
        super(fi, banda);
    }

    @Override
    public String evolutie(String stareInitiala) {
        int indexBanda = 0;
        StringBuilder output = new StringBuilder();
        Triplet triplet = new Triplet();

        triplet.stare = stareInitiala;

        output.append("(");
        output.append(triplet.stare);
        output.append(", ");
        output.append(stareBanda());
        output.append(", ");
        output.append(indexBanda);
        output.append(") ");

        do {
            if (stareBanda().isEmpty() || indexBanda < 0 || indexBanda >= stareBanda().length()) {
                break;
            }

            triplet = f(triplet.stare, Character.toString(stareBanda().charAt(indexBanda)));
            bb.setCharAt(indexBanda, triplet.symbol.charAt(0));
            indexBanda += triplet.deplasare;

            output.append("-> \n(");
            output.append(triplet.stare);
            output.append(", ");
            output.append(stareBanda());
            output.append(", ");
            output.append(indexBanda);
            output.append(") ");
        } while (!triplet.stare.equals("err") && !triplet.stare.equals("fin"));

        return output.toString();
    }

    @Override
    public Triplet f(String stare, String intrare) {
        return ff.calcul(stare, intrare);
    }
}
