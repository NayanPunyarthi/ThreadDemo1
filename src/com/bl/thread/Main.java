package com.bl.thread;
public class Main {

    public static void main(String[] args) {
        CharacterThread charThread = new CharacterThread();
        NumberRunnable numRunnable = new NumberRunnable(charThread);
        Thread numThread = new Thread(numRunnable);
        //numThread.setDaemon(true);

        numThread.start();
        charThread.start();

        System.out.println("End Of Main");
    }
}
