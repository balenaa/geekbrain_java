package hw5;

import java.util.Random;

public class Dog extends Animal {

    public Dog(){
        super("Пёсик", 400, 200, 50);
        Random rand = new Random();
        this.runDistanceLimit -= rand.nextInt(200)-100;
        this.swimDistanceLimit -= rand.nextInt(100)-50;
        this.jumpHeightLimit -=  rand.nextInt(20)-10;
    }
}
