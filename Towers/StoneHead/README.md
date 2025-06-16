
# Snippet Code
```java
public void playTowerAnimation(PImage stoneHead1, PImage stoneHead2, PImage stoneHead3, PImage stoneHead4, int loop) {
        int health = super.getHealth();
        if (health >= 54) {
            p.image(stoneHead1, (float) super.getXPos(), (float) super.getYPos());
        } else if (health >= 36) {
            p.image(stoneHead2, (float) super.getXPos(), (float) super.getYPos());
        } else if (health >= 18) {
            p.image(stoneHead3, (float) super.getXPos(), (float) super.getYPos());
        } else {
            p.image(stoneHead4, (float) super.getXPos(), (float) super.getYPos());
        }
    }
```

# Summary
Above is the method I made to switch between different stages of the stone head depending on his health. The less health it has the more broken it looks. 

## Images

| Name             | Preview                          |
|------------------|----------------------------------|
| Stone Head Stage 1   | ![Stone Head Stage 1](StoneHead1.png)   |
| Stone Head Stage 2  | ![Stone Head Stage 2](StoneHead2.png)   |
| Stone Head Stage 3   | ![Stone Head Stage 3](StoneHead3.png)   |
| Stone Head Stage 4   | ![Stone Head Stage 4](StoneHead4.png)   |
