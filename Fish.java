import java.util.Random;

public class Fish extends Animal {
    Random random = new Random();
    public Fish() {
        symbol = "F";
    }
    public int act() {
        if (random.nextInt(10) <2) {
            return NOWHERE;
        } 
        else {
            return RIGHT;
        }
    }
}