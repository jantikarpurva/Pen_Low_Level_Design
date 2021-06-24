package RefillClasses;

import Strategies.RefillStrategy;

public class RefillByInk implements RefillStrategy {
    String inkColor;

    public RefillByInk(String inkColor){
        this.inkColor = inkColor;
    }
    @Override
    public void refill() {
        System.out.println(" Changed refill ! Poured "+this.inkColor+" Ink ");
    }

    public String getInkColor() {
        return inkColor;
    }

    public void setInkColor(String inkColor) {
        this.inkColor = inkColor;
    }
}
