package Factories;

import Entities.Pen;
import Entities.Pens.BallPen;
import Entities.Pens.InkPen;
import Entities.Pens.Marker;

public class PenFactory {
    public static Pen create(String type){
        if(type.equals("Ball pen"))
            return new BallPen();
        if (type.equals("Ink pen"))
            return new InkPen();
        if (type.equals("Marker"))
            return new Marker();
        else{
            System.out.println("Pen type doesn't exsist in system");
            System.exit(0);
            return null;
        }
    }
}
