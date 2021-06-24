package IsWorkingClasses;

import Strategies.IsWorkingStrategy;

public class checkByScribbling implements IsWorkingStrategy {
    private boolean scribble=true;
    @Override
    public void isWorking() {
        System.out.println(" Scribbling on paper ");
        if(scribble)
            System.out.println(" Scribbled, it works ");
        else
            System.out.println(" Nothing on paper :( it doesn't work ");
    }

    public boolean isScribble() {
        return scribble;
    }

    public void setScribble(boolean scribble) {
        this.scribble = scribble;
    }
}
