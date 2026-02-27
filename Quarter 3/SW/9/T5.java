import java.util.Timer;
import java.util.TimerTask;

public class Task5Q3 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            @Override
            public void run(){
                System.out.println("Hello! we've Installed trojanware in your device!");
            }
        };
        timer.schedule(task, 0, 1000);

        // Loop to print the message every second as well
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println("Please wait as we harvest the necessary Data Thank you!");
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
