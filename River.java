import java.util.Random;

public class River {
    Random random = new Random();
    Animal river[];

    public River(int length) {
        river = new Animal[length];
    }

    public void addAnimal(Animal a, int index) {
        if ((index < river.length) && (river[index] == null)) {
            river[index] = a;
        }
    }

    public void print() {
        for (int i = 0; i< river.length; i++) {
            if (river[i] == null) {
                System.out.print("*");
            }
            else {
                System.out.print(river[i]);
            }
        }
        System.out.println();
        
    }

    public void step() {
        for (int i = 0; i< river.length; i++) {
            if (river[i] != null) {
                int act=river[i].act();
                if (act == Animal.LEFT && i > 0) {
                    if(river[i-1] == null) {
                        river[i-1] = river[i];
                        river[i] = null;
                    }
                    else if (river[i] instanceof Bear && river[i-1] instanceof Fish) {
                        river[i-1] = river[i];
                        river[i] = null;
                    }
                    else if (river[i-1] instanceof Bear && river[i] instanceof Bear) {
                        for (int j = random.nextInt(river.length); j< river.length; j++) {
                            if (river[j] == null) {
                                river[j] = new Bear();
                                break;
                            }
                        }
                    }
                    else if (river[i-1] instanceof Fish && river[i] instanceof Fish) {
                        for (int j = random.nextInt(river.length); j< river.length; j++) {
                            if (river[j] == null) {
                                river[j] = new Fish();
                                break;
                            }
                        }
                    }
                }
                if (act == Animal.RIGHT && (i+1 < river.length)) {
                    if (river[i+1] == null) {
                        river[i+1] = river[i];
                        river[i] = null;
                        i++;
                    }
                    else if (river[i] instanceof Fish && river[i+1] instanceof Bear) {
                        river[i] = null;
                    }
                    else if (river[i] instanceof Bear && river[i+1] instanceof Fish) {
                        river[i+1] = river[i];
                        river[i] = null;
                    }
                    else if (river[i] instanceof Bear && river[i+1] instanceof Bear) {
                        for (int j = random.nextInt(river.length); j< river.length; j++) {
                            if (river[j] == null) {
                                river[j] = new Bear();
                                break;
                            }
                            if (j == river.length-1) {
                                j = random.nextInt(river.length);
                            }
                        }
                    }
                    else if (river[i] instanceof Fish && river[i+1] instanceof Fish) {
                        for (int j = random.nextInt(river.length); j< river.length; j++) {
                            if (river[j] == null) {
                                river[j] = new Fish();
                                break;
                            }
                            if (j == river.length-1) {
                                j = random.nextInt(river.length);
                            }
                        }
                    }
                }
            }
        }
    }
}
