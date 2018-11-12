package com.example.alexandra.petri;

public class Transition extends Thread {
    private Process[] in;
    private Process[] out;

    public Transition(Process[] in, Process[] out) {
        this.in = in;
        this.out = out;
    }

    public Transition(Process in, Process[] out) {
        this.in = new Process[]{in};
        this.out = out;
    }

    public Transition(Process[] in, Process out) {
        this.in = in;
        this.out = new Process[]{out};
    }

    public Transition(Process in, Process out) {
        this.in = new Process[]{in};
        this.out = new Process[]{out};
    }

    @Override
    public void run() {
        triggerTransition(this);
    }

    private static synchronized void triggerTransition(Transition transition) {
        for (Process process : transition.in) {
            if (!process.canGiveTokens()) {
                return;
            }
        }

        for (Process process : transition.in) {
            process.giveTokens();
        }

        for (Process process : transition.out) {
            process.receiveTokens();
        }
    }
}
