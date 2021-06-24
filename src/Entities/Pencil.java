package Entities;

import Interfaces.Write;

public class Pencil implements Write {
    @Override
    public void write() {
        System.out.println("Pencil writes --> "+ " Hello World :) ");
    }
}
