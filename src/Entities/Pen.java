package Entities;

import Interfaces.Write;
import Strategies.IsWorkingStrategy;
import Strategies.RefillStrategy;


public abstract class Pen implements Write{

    private String type;
    private String color;
    private String size;
    private String name;
    private final IsWorkingStrategy isWorkingStrategy; // Every pen should have a isWorkingStrategy, and it can be any
    private final RefillStrategy refillStrategy; // Every pen should have a refillStrategy and you dont have to know which one is coming in

    // Constructor
    public Pen(String type, String color, String size, String name, IsWorkingStrategy isWorkingStrategy, RefillStrategy refillStrategy){
        this.type = type;
        this.color = color;
        this.size = size;
        this.name = name;
        this.isWorkingStrategy = isWorkingStrategy;
        this.refillStrategy = refillStrategy;
    }

    public void printCreatedObject(){
        System.out.println("You created a "+getType());
        System.out.println("Color is "+getColor());
        System.out.println("Size is "+getSize());
        System.out.println("You have named it "+getName());
    }

    public void works(){
        isWorkingStrategy.isWorking(); // Doesn't matter which working strategy comes in, it will have isWorking() function
    }

    public void refill(){
        refillStrategy.refill(); // Doesn't matter which refill strategy comes in, it will have refill() function
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
