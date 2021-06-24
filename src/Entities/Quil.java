package Entities;

import Interfaces.Write;

public class Quil implements Write {
    @Override
    public void write() {
        System.out.println("Quill is gracefully writing --> "+ " Hello my love ");
    }
}
