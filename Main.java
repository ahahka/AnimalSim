public class Main {
    public static void main(String[] args) {
        River river = new River(100);  
  
        river.addAnimal(new Fish(), 0);
        river.addAnimal(new Fish(), 1);    
        river.addAnimal(new Fish(), 2); 
        river.addAnimal(new Fish(), 3);     
        river.addAnimal(new Bear(), 98);  
        river.addAnimal(new Bear(), 99);  
  
        river.print();

        while(true) {  
    river.step();  
    river.print(); 


    //slow down the running of the program
    try {  
        Thread.sleep(1000); //1000 ms = 1 second, wait and begin again 
                            //after 1 second has passed 
    } catch (InterruptedException e) {  
        throw new RuntimeException(e);  
    }  
}
        
    }
}
