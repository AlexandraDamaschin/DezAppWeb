package com.example.alexandra.petri;

public class Test {
    public static void main(String[] args) {
        Process p1 = new Process(1, 2, 3);
        Process p2 = new Process(3, 4, 56);
        Process p3 = new Process(5, 6, 2);
        Process p4 = new Process(7, 18, 99);
        Process[] processes = {p1, p2, p3, p4};

        Transition transition = new Transition(processes, p4);
        Transition transition1 = new Transition(p1, p4);
        Transition[] transitions = {transition, transition1};


        PetriNetwork petriNetwork = new PetriNetwork(processes, transitions);
        petriNetwork.printStatus();
        petriNetwork.triggerAllTransitions();
        petriNetwork.printStatus();

    }
}
