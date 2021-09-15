package com.bl.thread;

public class NumberRunnable implements Runnable {
    private CharacterThread characterThread;
    public NumberRunnable(CharacterThread characterThread){
        this.characterThread = characterThread;
    }
    @Override
    public void run() {
        System.out.println("Number Thread Started");
        for (int i = 0; i <= 100; i++) {
            if (characterThread.exit) {
                break;
            }
                System.out.println( i );
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }




