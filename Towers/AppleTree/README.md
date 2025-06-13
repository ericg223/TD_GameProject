
# Snippet Code
```java
public int collectMoney() {
  if (stageLevel == 1) {
    System.out.println("No apples here!");
    return 0;
  } else if (stageLevel == 2) {
    System.out.println("+25");
    System.out.println("\u001B[33m"+"Tip: Next time, wait for there to be 6 apples before collecting" + "\u001B[0m");
    stageLevel = 1;
    return 25;
  } else {
    System.out.println("+$100");
    stageLevel = 1;
    return 100;
  }
}
```

# Summary
I had a fun time making this tower because it was unique from the other towers. It doesn't do damage, but it provides money so the player can buy more towers. I also added different stages to the tower. You can collect the apples early at stage 2, or you can wait longer and get more money at stage 3. The apple tree grows into different stages after a few second and returns to the first stage after you collect the apples. 

## Images

| Name             | Preview                          |
|------------------|----------------------------------|
| Apple Tree Stage 1   | ![Apple Tree Stage 1](AppleTreeStage1.png)   |
| Apple Tree Stage 2   | ![Apple Tree Stage 2](AppleTreeStage2.png)   |
| Apple Tree Stage 3   | ![Apple Tree Stage 3](AppleTreeStage3.png)   |
