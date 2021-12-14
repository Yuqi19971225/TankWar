import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

public class GameLauncher {
    public static void main(String[] args) throws InterruptedException{
        TankFrame f = new TankFrame();

        while (true) {
            Thread.sleep(50);
            f.repaint();
        }

    }
}
