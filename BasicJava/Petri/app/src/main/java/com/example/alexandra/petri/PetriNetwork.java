package com.example.alexandra.petri;

public class PetriNetwork {
    private Process[] processes;
    private Transition[] transitions;

    public PetriNetwork(Process[] processes, Transition[] transitions) {
        this.processes = processes;
        this.transitions = transitions;
    }

    public void triggerAllTransitions() {
        for (Transition transition : transitions) {
            transition.run();
        }
    }

    public void printStatus() {
        for (Transition transition : transitions) {
            try {
                transition.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.print("M = [");

        for (int i = 0; i < processes.length - 1; i++) {
            System.out.print(processes[i].getNumberOfTokens() + ", ");
        }

        System.out.println(processes[processes.length - 1].getNumberOfTokens() + "]");
    }
}
