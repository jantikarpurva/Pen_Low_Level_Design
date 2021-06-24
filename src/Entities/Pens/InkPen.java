package Entities.Pens;

import Entities.Pen;
import Strategies.IsWorkingStrategy;
import Strategies.RefillStrategy;

public class InkPen extends Pen {
    public InkPen(String type, String color, String size, String name, IsWorkingStrategy isWorkingStrategy, RefillStrategy refillStrategy){
        super(type,color,size,name,isWorkingStrategy,refillStrategy);
    }

    // Since pen is implementing Write interface, so write() has to be implemented
    @Override
    public void write() {
        System.out.println("Ink pen writes --> " + " Holla Amigo ");
    }
}
