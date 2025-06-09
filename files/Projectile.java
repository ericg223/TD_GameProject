import processing.core.PApplet;
import java.util.ArrayList;
public class Projectile{

    private int damage, xPos, yPos;
    private int row;
    public Projectile(int damage, int xPos, int yPos, int row) {
        this.damage = damage;
        this.xPos = xPos;
        this.yPos = yPos;
        this.row = row;
    }
    public void touchedEnemy(ArrayList<Enemy> enemies) {
        for (int i = 0; i < enemies.size(); i++) {
            int enemyXPos = enemies.get(i).getXPos();
            if (xPos < enemyXPos && xPos > enemyXPos + 10 && yPos == enemies.get(i).getYPos()) {
                System.out.println("Hit");
                enemies.get(i).updateHealth(damage);
                return;
            }
        }
        return;
    }
    public void updateProjectile(int xSpeed, int ySpeed) {
        xPos += xSpeed;
        yPos += ySpeed;
    }
    public int getXPos() {
        return xPos;
    }
    public int getYPos() {
        return yPos;
    }
   
  

}
