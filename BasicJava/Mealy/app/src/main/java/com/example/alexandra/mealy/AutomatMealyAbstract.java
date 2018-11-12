package com.example.alexandra.mealy;
// E=a(a|b)*c


interface functie {
    public String calcul(String stare, String intrare);
}

class fc implements functie {
    public String calcul(String stare, String intrare) {
        String returnValue = "err";

        switch (stare) {
            case "1":
                returnValue = (intrare.equals("a") ? "2" : "err");
                break;
            case "2":
                if (intrare.equals("a")) {
                    returnValue = "3";
                } else if (intrare.equals("b")) {
                    returnValue = "4";
                } else if (intrare.equals("c")) {
                    returnValue = "5";
                }

                break;

            case "3":
                if (intrare.equals("a")) {
                    returnValue = "3";
                } else if (intrare.equals("b")) {
                    returnValue = "4";
                } else if (intrare.equals("c")) {
                    returnValue = "5";
                }

                break;

            case "4":
                if (intrare.equals("a")) {
                    returnValue = "3";
                } else if (intrare.equals("b")) {
                    returnValue = "4";
                } else if (intrare.equals("c")) {
                    returnValue = "5";
                }

                break;

            case "5": {
                break;
            }
        }

        return returnValue;
    }
}

class gc implements functie {
    public String calcul(String stare, String intrare) {
        return intrare.toUpperCase();
    }
}

public abstract class AutomatMealyAbstract {
    functie ff;
    functie gg;

    public AutomatMealyAbstract(functie fi, functie gi) {
        ff = fi;
        gg = gi;
    }

    public abstract String f(String stare, String intrare);

    public abstract String g(String stare, String intrare);

    public abstract String evolutie(String stareInitiala, String stringIntrare);

}
