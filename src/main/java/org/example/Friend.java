package org.example;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Friend extends Contact{

    String telephoneNumber;

// Constructor /////////////////
    public Friend(){
        super();
    }

    public Friend(String name,String telephoneNumber) {
        super(name);
        this.telephoneNumber = telephoneNumber;
    }

//   /////////////////////////



    @Override
    public String toString() {
        return "Friend{" + ", name='" + name + '\'' +
                "telephoneNumber='" + telephoneNumber + '\'' +

                '}';
    }
}
