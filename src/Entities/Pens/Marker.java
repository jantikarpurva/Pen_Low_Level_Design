package Entities.Pens;

import Entities.Pen;
import Strategies.IsWorkingStrategy;
import Strategies.RefillStrategy;

public class Marker extends Pen {
    public Marker(String type, String color, String size, String name, IsWorkingStrategy isWorkingStrategy, RefillStrategy refillStrategy){
        super(type,color,size,name,isWorkingStrategy,refillStrategy);
    }

    // Since pen is implementing Write interface, so write() has to be implemented
    @Override
    public void write() {
        System.out.println("Marker is writing -->"+ " BOLD ");
    }
}
