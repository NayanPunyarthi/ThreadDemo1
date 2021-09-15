package com.bl.thread;

public class CharacterThread extends Thread{
    //static boolean exit = false;
   public boolean exit;
    @Override
    public void run() {

        System.out.println("Character Thread Started");
        for (char i = 'A'; i <= 'Z' ; i++ ) {
            System.out.println( i );
            if(i == 'Z') {
                exit = true;
            }
            try {
                Thread.sleep(10 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}




