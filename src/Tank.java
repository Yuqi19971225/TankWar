import java.awt.*;

public class Tank {
    private int x, y;
    private Dir dir = Dir.DOWN;
    private static final int SPEED = 5;
    private boolean moving = false;
    private TankFrame tf = null;

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    public Dir getDir() {
        return dir;
    }


    public Tank(int x, int y, Dir dir, TankFrame tf) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        //从TankFrame类传入参数
        this.tf = tf;
    }

    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.YELLOW);
        g.fillRect(x, y, 50, 50);
        g.setColor(c);
        move(g);
    }

    private void move(Graphics g) {
        if (!moving) return;
        switch (dir) {
            case LEFT:
                x -= SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            case UP:
                y -= SPEED;
                break;
            case DOWN:
                y += SPEED;
                break;
        }
    }

    public void fire() {
        tf.b = new Bullet(this.x, this.y, this.dir);
    }

}
