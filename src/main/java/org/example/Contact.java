package org.example;

import java.awt.*;
import java.util.ArrayList;

public abstract class Contact {

    String name;


    public Contact(){

    }
    public Contact(String name) {
        this.name = name;
    }



    public void setName(String name) {
        this.name = name;
    }
}
