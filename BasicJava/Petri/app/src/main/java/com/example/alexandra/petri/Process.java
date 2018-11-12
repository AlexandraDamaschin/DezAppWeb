package com.example.alexandra.petri;

public class Process {
    private int inputCapacity;
    private int outputCapacity;
    private int tokens;

    public Process(int inputCapacity, int outputCapacity) {
        this.inputCapacity = inputCapacity;
        this.outputCapacity = outputCapacity;
        tokens = 0;
    }

    public Process(int inputCapacity, int outputCapacity, int tokens) {
        this.inputCapacity = inputCapacity;
        this.outputCapacity = outputCapacity;
        this.tokens = tokens;
    }

    public boolean canGiveTokens() {
        return tokens >= outputCapacity;
    }

    public void giveTokens() {
        tokens -= outputCapacity;
    }

    public void receiveTokens() {
        tokens += inputCapacity;
    }

    public int getNumberOfTokens() {
        return tokens;
    }
}
