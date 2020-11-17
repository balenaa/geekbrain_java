package hw5;

import java.util.Random;

public class Cat extends Animal {

    public Cat(){
        super("Котик", 200, 0, 150);
        Random rand = new Random();
        this.runDistanceLimit -= rand.nextInt(100)-50;
        this.jumpHeightLimit -=  rand.nextInt(50)-25;
    }

    @Override
    public String swim(int distance) {
        return "Котик утонул. Котики не плавают";
    }


}
