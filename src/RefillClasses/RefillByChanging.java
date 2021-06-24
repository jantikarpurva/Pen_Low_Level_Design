package RefillClasses;

import Strategies.RefillStrategy;

public class RefillByChanging implements RefillStrategy {
    String refillColor;

    public RefillByChanging(String refillColor){
        this.refillColor = refillColor;
    }

    @Override
    public void refill() {
        System.out.println("Changed its refill !"+ " Refill color = "+ this.refillColor);
    }

    public String getRefillColor() {
        return refillColor;
    }

    public void setRefillColor(String refillColor) {
        this.refillColor = refillColor;
    }
}
