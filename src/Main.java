import Entities.Pen;
import Entities.Pencil;
import Entities.Pens.BallPen;
import Entities.Quil;
import IsWorkingClasses.checkByScribbling;
import RefillClasses.RefillByChanging;
import RefillClasses.RefillByInk;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Creates a Ball Pen which is of type Pen.
        Pen p1 = new BallPen("Ball Pen","Red","Medium","WritoMeter",new checkByScribbling(), new RefillByChanging("Pink"));
        p1.printCreatedObject();
        System.out.println("");
        p1.write();
        System.out.println("");
        p1.works();
        System.out.println("");
        p1.refill();
    }
}
