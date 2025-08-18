import java.util.Random;

public class Bear extends Animal {
    Random random = new Random();
    public Bear() {
        symbol = "B";
    }
    public int act() {
        if (random.nextInt(10) <7) {
            return LEFT;
        } 
        else {
            return RIGHT;
        }
    }
}
