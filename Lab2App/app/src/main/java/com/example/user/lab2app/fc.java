package com.example.user.lab2app;


/* returneaza starea */
public class fc implements functie {
    public String calcul(String stare, String intrare) {
// Implementare prin swich
        switch (stare) {
            case "1":
                if (intrare == "a") {
                    return "2";
                } else {
                    return "eroare";
                }

            case "2":
                if (intrare == "a") {
                    return "3";
                } else if (intrare == "b") {
                    return "4";
                } else if (intrare == "c") {
                    return "5";
                } else return "eroare";

            case "3":

                if (intrare == "a") {
                    return "3";
                } else if (intrare == "b") {
                    return "4";
                } else if (intrare == "c") {
                    return "5";
                } else return "eroare";

            case "4":

                if (intrare == "a") {
                    return "3";
                } else if (intrare == "b") {
                    return "4";
                } else if (intrare == "c") {
                    return "5";
                } else return "eroare";
            default:
                return "eroare";

        }
    }
}
