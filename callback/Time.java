package callback;

import java.util.Date;

public class Time {
    Thread run = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(10000);
                    Date now = new Date();
                    System.out.println("Время 10 секунд назад: " + now);
                } catch (InterruptedException ex) {
                }
            }
        }
    });
}
