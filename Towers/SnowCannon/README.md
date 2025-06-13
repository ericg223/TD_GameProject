
# Snippet Code
```java
public void updateWalkSpeed(double percent) {
        if (slowCount <= 3) {
            double temp = speed * (1-percent);
            speed = (int) temp;
            slowCount++;
            System.out.println("Applied Slow");
        }
    }
```

# Summary
This is pretty similar to the cannon and mythic cannon tower. They both use inheritance. However, this cannon has a little twist: it can apply a slow debuff to enemies. The slow debuff can be apply 3 times, which is why there is a variable for count. The enemy gets slow by 25% each time it has a slow debuff. 

## Images

| Name             | Preview                          |
|------------------|----------------------------------|
| Snow Cannon Frame 1   | ![Snow Cannon Frame 1](SnowCannon1.png)   |
| Snow Cannon Frame 2   | ![Snow Cannon Frame 2](SnowCannon2.png)   |
| Snow Cannon's Bullet  | ![Snow Cannon's Bullet](SnowCannonBullet.png) |
| Full Animation   |![Image](https://github.com/user-attachments/assets/ea1c1b77-62a6-456e-ab6e-4e8d84bafe86)|

