package com.example.alexandra.turing;

interface ITransitionFunction {
    public Triplet calcul(String stare, String intrare);
}

public class TransitionFunction implements ITransitionFunction {
    public Triplet calcul(String stare, String intrare) {
        Triplet triplet = new Triplet();

        triplet.stare = "err";
        triplet.symbol = "";
        triplet.deplasare = 0;

        switch (stare) {
            case "0":
                if (intrare.equals("0")) {
                    triplet.stare = "1";
                    triplet.symbol = "x";
                    triplet.deplasare = 1;
                }

                break;
            case "1":
                switch (intrare) {
                    case "0":
                        triplet.stare = "1";
                        triplet.symbol = "0";
                        triplet.deplasare = 1;
                        break;
                    case "y":
                        triplet.stare = "1";
                        triplet.symbol = "y";
                        triplet.deplasare = 1;
                        break;
                    case "1":
                        triplet.stare = "2";
                        triplet.symbol = "y";
                        triplet.deplasare = -1;
                        break;
                }

                break;
            case "2":
                switch (intrare) {
                    case "y":
                        triplet.stare = "2";
                        triplet.symbol = "y";
                        triplet.deplasare = -1;
                        break;
                    case "x":
                        triplet.stare = "3";
                        triplet.symbol = "x";
                        triplet.deplasare = 1;
                        break;
                    case "0":
                        triplet.stare = "4";
                        triplet.symbol = "0";
                        triplet.deplasare = -1;
                        break;
                }

                break;
            case "3":
                switch (intrare) {
                    case "y":
                        triplet.stare = "3";
                        triplet.symbol = "y";
                        triplet.deplasare = 1;
                        break;
                    case "b":
                        triplet.stare = "5";
                        triplet.symbol = "y";
                        triplet.deplasare = 1;
                        break;
                }

                break;
            case "4":
                switch (intrare) {
                    case "0":
                        triplet.stare = "4";
                        triplet.symbol = "0";
                        triplet.deplasare = -1;
                        break;
                    case "x":
                        triplet.stare = "0";
                        triplet.symbol = "x";
                        triplet.deplasare = 1;
                        break;
                }

                break;
            case "5":
                triplet.stare = "fin";
                triplet.symbol = "0";
                triplet.deplasare = 0;
                break;
        }

        return triplet;
    }
}
