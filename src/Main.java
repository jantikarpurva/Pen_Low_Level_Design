import Entities.Pen;
//import Entities.Pencil;
//import Entities.Pens.BallPen;
//import Entities.Quil;
//import RefillClasses.RefillByInk;
import Factories.PenFactory;
import IsWorkingClasses.checkByScribbling;
import RefillClasses.RefillByChanging;


public class Main {

    public static void main(String[] args) {
	// write your code here

        // Creates a Ball Pen which is of type Pen.
        Pen p1 = PenFactory.create("Ink pen");
        p1.setType("Ball pen");
        p1.setName("Writto Meter");
        p1.setColor("Blue");
        p1.setSize("Medium");
        p1.setIsWorkingStrategy(new checkByScribbling());
        p1.setRefillStrategy(new RefillByChanging("Dark blue"));

        p1.printCreatedObject();
        System.out.println("");
        p1.write();
        System.out.println("");
        p1.works();
        System.out.println("");
        p1.refill();
    }
}
