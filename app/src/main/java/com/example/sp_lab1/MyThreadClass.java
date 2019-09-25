package com.example.sp_lab1;

public class MyThreadClass extends Thread {
    MainActivity main = new MainActivity();
    public void run() {
        try {
            while (!Thread.interrupted()) {

                main.setTextToField();
                Thread.sleep(5000);

            }
        } catch(InterruptedException e) {
            return;
        }
    }
}
