import processing.core.PApplet;
import processing.core.PImage;
public class Tower  {
    private double price, range;
    private int row, xPos, yPos;
    PApplet p;

    public Tower(PApplet p, double price, double range, int xPos, int yPos, int row) {
        this.p = p;
        this.price = price;
        this.range = range;
        this.xPos = xPos;
        this.yPos = yPos;
        this.row = row;
    }
    public int getRow() {
        return row;
    }
    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }
    
    public void fireProjectile() { //cannons only
        System.out.println("Error in fireProjectile Tower.java");
    }

    public void updateProjectiles(PImage cannonBullet) { //cannons only
        System.out.println("Error in updateProjectile Tower.java");
    }
    public void playTowerAnimation(PImage cannon1, PImage cannon2, int loop) { //currently for cannons only
        System.out.println("Error in playTowerAnimation");
    }
  

}
