import processing.core.PApplet;
import processing.core.PImage;
import java.util.ArrayList;
public class Cannon extends Tower{
    private double fireRate;
    private int damage;
    private ArrayList<Projectile> projectiles = new ArrayList<Projectile>();
    private PApplet p;
    private ArrayList<Enemy> enemies;
    public Cannon(PApplet p, int damage, double fireRate, double range, double price, int xPos, int yPos, int row, ArrayList<Enemy> enemies) {
        super(p, price, range, xPos, yPos, row);
        this.damage = damage;
        this.fireRate = fireRate;
        this.p = p;
        this.enemies = enemies;
        
    }
    public void fireProjectile() {
    
        projectiles.add(new Projectile(damage, super.getXPos() + 35, super.getYPos(), super.getRow()));

    }
    public void playTowerAnimation(PImage cannon1, PImage cannon2, int loop) {
       
        if (loop >= 30) {
        
            p.image(cannon1, (float) super.getXPos(), (float) super.getYPos());
           
        } else {
    
            p.image(cannon2, (float) super.getXPos(), (float) super.getYPos());
        }

    }
    public void updateProjectiles(PImage cannonBullet) {
        for (int i = projectiles.size() - 1; i >= 0; i--) {
            Projectile projectile = projectiles.get(i);
            projectile.updateProjectile(2,0);
            p.image(cannonBullet, (float) projectile.getXPos(), (float) projectile.getYPos());
            projectile.touchedEnemy(enemies);
            if (projectile.getXPos() > 550 || projectile.getXPos() < 50 || projectile.getYPos() > 475 || projectile.getYPos() < 75) {
                
                projectiles.remove(i);
            }
        }

    }
   
  

}/
