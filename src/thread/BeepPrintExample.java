package thread;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        Thread thread=new Thread(()->{
            Toolkit toolkit=Toolkit.getDefaultToolkit();
            for (int i = 0; i < 5; i++) {
                toolkit.beep();
                System.out.println("beep!");
                try {
                    Thread.sleep(1000);
                } catch (Exception exceptioin) {}
            }
        });

        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            }catch(Exception e){}
        }
    }
}
