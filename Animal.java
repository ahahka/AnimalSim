

public abstract class Animal {
    protected String symbol;
    public Animal() {
        symbol = "*";
    }
    
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String toString(){
        return symbol;
    }

    public abstract int act();

    public static final int LEFT = 1;  
    public static final int RIGHT = 2;  
    public static final int NOWHERE = 0;
    
}
