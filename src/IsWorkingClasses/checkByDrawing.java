package IsWorkingClasses;

import Strategies.IsWorkingStrategy;

public class checkByDrawing implements IsWorkingStrategy {
    private boolean works=true;
    @Override
    public void isWorking() {
        System.out.println(" Drawing please wait ");
        if(works)
            System.out.println("Oh yes it works ");
        else
            System.out.println("Sorry it doesn't work :( ");
    }

    public boolean isWorks() {
        return works;
    }

    public void setWorks(boolean works) {
        this.works = works;
    }
}
