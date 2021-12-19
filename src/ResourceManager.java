import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ResourceManager {
    public static BufferedImage p1tankU, p1tankD, p1tankL, p1tankR;
    public static BufferedImage tankMissile;

    static {
        try {
            p1tankU = ImageIO.read(ResourceManager.class.getClassLoader().getResourceAsStream("img/p1tankU.gif"));
            p1tankD = ImageIO.read(ResourceManager.class.getClassLoader().getResourceAsStream("img/p1tankD.gif"));
            p1tankL = ImageIO.read(ResourceManager.class.getClassLoader().getResourceAsStream("img/p1tankL.gif"));
            p1tankR = ImageIO.read(ResourceManager.class.getClassLoader().getResourceAsStream("img/p1tankR.gif"));
            tankMissile=ImageIO.read(ResourceManager.class.getClassLoader().getResourceAsStream("img/tankmissile.gif"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
